package com.yanki.app.services;

import com.yanki.app.beans.Transaction;
import com.yanki.app.beans.User;
import com.yanki.app.feignclients.TransactionFeignClient;
import com.yanki.app.feignclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionFeignClient transactionFeignClient;
    @Autowired
    private UserFeignClient userFeignClient;

    public Transaction newTransaction(Transaction transaction) {
        Transaction movement = transactionFeignClient.insert(transaction);
        User userTarget = userFeignClient.find(movement.getTarget());
        userTarget.getWallet().setAmount(userTarget.getWallet().getAmount().add(movement.getAmount()));
        userFeignClient.insert(userTarget);

        User userSource = userFeignClient.find(movement.getSource());
        userSource.getWallet().setAmount(userSource.getWallet().getAmount().subtract(movement.getAmount()));
        userFeignClient.insert(userSource);

        return  movement;
    }
}
