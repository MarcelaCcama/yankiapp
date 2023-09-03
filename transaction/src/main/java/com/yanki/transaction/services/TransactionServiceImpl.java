package com.yanki.transaction.services;

import com.yanki.transaction.documents.Transaction;
import com.yanki.transaction.repository.TransactionRepository;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.adapter.rxjava.RxJava3Adapter;

@Service
public class TransactionServiceImpl implements  TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Flowable<Transaction> findAll() {
        return RxJava3Adapter.fluxToFlowable(transactionRepository.findAll());
    }

    @Override
    public Maybe<Transaction> findById(String id) {
        return RxJava3Adapter.monoToMaybe(transactionRepository.findById(id));
    }

    @Override
    public Maybe<Transaction> save(Transaction transaction) {
        return RxJava3Adapter.monoToMaybe(transactionRepository.save(transaction));
    }

    @Override
    public Maybe<Void> delete(Transaction transaction) {
        return RxJava3Adapter.monoToMaybe(transactionRepository.delete(transaction));
    }
}
