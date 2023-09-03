package com.yanki.transaction.controller;

import com.yanki.transaction.documents.Transaction;
import com.yanki.transaction.services.TransactionService;
import com.yanki.transaction.services.TransactionServiceImpl;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.function.Supplier;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionServiceImpl service;

    @GetMapping("/")
    public Flowable<Transaction> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Maybe<Transaction> find(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/insert")
    public Maybe<Transaction> insert(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }



    @PostMapping("/delete")
    public Maybe<Void> delete(@RequestBody Transaction transaction) {

        return service.delete(transaction);
    }
}
