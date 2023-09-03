package com.yanki.transaction.services;

import com.yanki.transaction.documents.Transaction;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    public Flowable<Transaction> findAll();

    public Maybe<Transaction> findById(String id);

    public Maybe<Transaction> save(Transaction transaction);

    public Maybe<Void> delete(Transaction transaction);

}