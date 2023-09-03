package com.yanki.user.services;

import com.yanki.user.documents.User;
import com.yanki.user.repository.UserRepository;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.adapter.rxjava.RxJava3Adapter;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public Flowable<User> findAll() {
        return RxJava3Adapter.fluxToFlowable(userRepository.findAll());
    }

    @Override
    public Maybe<User> findById(String id) {
        return RxJava3Adapter.monoToMaybe(userRepository.findById(id));
    }

    @Override
    public Maybe<User> save(User user) {
        return RxJava3Adapter.monoToMaybe(userRepository.save(user));
    }

    @Override
    public Maybe<Void> delete(User user) {
        return RxJava3Adapter.monoToMaybe(userRepository.delete(user));
    }
}
