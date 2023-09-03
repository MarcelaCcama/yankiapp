package com.yanki.user.services;

import com.yanki.user.documents.User;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Flowable<User> findAll();

    public Maybe<User> findById(String id);

    public Maybe<User> save(User user);

    public Maybe<Void> delete(User user);

}