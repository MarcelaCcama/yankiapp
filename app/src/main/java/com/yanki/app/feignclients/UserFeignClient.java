package com.yanki.app.feignclients;

import com.yanki.app.beans.User;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user", path = "/api/users")
public interface UserFeignClient {
    @GetMapping("/{id}")
    public User find(@PathVariable String id);

    @PostMapping("/insert")
    public User insert(@RequestBody User user);
}
