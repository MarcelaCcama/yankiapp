package com.yanki.user.controller;

import com.yanki.user.documents.User;
import com.yanki.user.services.UserService;
import com.yanki.user.services.UserServiceImpl;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.function.Supplier;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/")
    public Flowable<User> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Maybe<User> find(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/insert")
    public Maybe<User> insert(@RequestBody User user) {
        return service.save(user);
    }

    @PostMapping("/update")
    public Maybe<User> update(@RequestBody User user) {

        return service.findById(user.getIdentificationDocument())
                .switchIfEmpty(Maybe.error(new Exception("USUARIO NO EXISTE")))
                .doOnSuccess(x -> x.setEmail(user.getEmail()))
                .flatMap(x -> service.save(x));
    }

    @PostMapping("/delete")
    public Maybe<Void> delete(@RequestBody User user) {

        return service.delete(user);
    }
}
