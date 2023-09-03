package com.yanki.app.feignclients;

import com.yanki.app.beans.Transaction;
import com.yanki.app.beans.User;
import io.reactivex.rxjava3.core.Maybe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "transaction")
@RequestMapping("/api/transactions/")
public interface TransactionFeignClient {
    @PostMapping("/insert")
    public Maybe<Transaction> insert(@RequestBody Transaction transaction);
}
