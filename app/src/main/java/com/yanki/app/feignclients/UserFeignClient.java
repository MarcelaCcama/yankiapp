package com.yanki.app.feignclients;

import com.yanki.app.beans.User;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user")
@RequestMapping("/api/users/")
public interface UserFeignClient {
    @PostMapping()
    public Maybe<User> insert(@RequestBody User user);
}
