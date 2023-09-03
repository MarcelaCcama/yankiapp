package com.yanki.app.services;

import com.yanki.app.beans.Transaction;
import com.yanki.app.feignclients.TransactionFeignClient;
import com.yanki.app.feignclients.UserFeignClient;
import io.reactivex.rxjava3.core.Maybe;

public class TransactionService {

    private TransactionFeignClient transactionFeignClient;
    private UserFeignClient userFeignClient;

    public Maybe<Transaction> newTransaction(Transaction transaction) {
        return transactionFeignClient.insert(transaction);
    }
}
