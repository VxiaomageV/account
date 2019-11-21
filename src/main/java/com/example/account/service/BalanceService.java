package com.example.account.service;

import com.example.account.vo.Balance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: demoFeign
 * @author: mal
 * @date: 2019/10/24
 */
@FeignClient(name = "payment", fallback = BalanceServiceFallback.class)
public interface BalanceService {

    @GetMapping(value = "/payment/pay/balance")
    Balance getBalance(@RequestParam("id") Integer id);

}
