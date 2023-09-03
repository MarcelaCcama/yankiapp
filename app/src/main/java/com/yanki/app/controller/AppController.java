package com.yanki.app.controller;

import com.yanki.app.beans.Transaction;
import com.yanki.app.services.TransactionService;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app")
public class AppController {

    TransactionService transactionService;

    @PostMapping("/transaction")
    public Maybe<Transaction> insert(@RequestBody Transaction transaction) {
        return transactionService.newTransaction(transaction);
    }
}
