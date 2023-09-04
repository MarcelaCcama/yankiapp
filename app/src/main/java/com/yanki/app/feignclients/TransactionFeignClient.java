package com.yanki.app.feignclients;

import com.yanki.app.beans.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "transaction", path = "/api/transactions")
public interface TransactionFeignClient {
    @PostMapping("/insert")
    public Transaction insert(@RequestBody Transaction transaction);
}
