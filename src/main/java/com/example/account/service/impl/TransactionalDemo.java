package com.example.account.service.impl;

import com.example.account.service.SysUserService;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @description: 事务demo
 * @author: mal
 * @date: 2019/10/28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TransactionalDemo {


    @Autowired
    SysUserService sysUserService;

    /**
     * description: 事务demo 读写提交 新建事务
     * creat: mal
     * date: 2019/10/28
     */
    public void insertSysUser() {
        ArrayList list = new ArrayList();
        list.get(10);
    }

}
