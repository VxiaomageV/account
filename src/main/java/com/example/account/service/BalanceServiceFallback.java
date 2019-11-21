package com.example.account.service;

import com.example.account.vo.Balance;
import org.springframework.stereotype.Component;

/**
 * @description: demo降级
 * @author: mal
 * @date: 2019/10/24
 */
@Component
public class BalanceServiceFallback implements BalanceService {

    @Override
    public Balance getBalance(Integer id) {
        return new Balance(0, 0, 0, "降级");
    }
}
