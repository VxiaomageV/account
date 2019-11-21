package com.example.account.cotroller;

import com.example.account.po.SysUser;
import com.example.account.service.SysUserService;
import com.example.account.service.impl.TransactionalDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户处理
 * @author: mal
 * @date: 2019/10/24
 */
@RestController
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @Autowired
    TransactionalDemo transactionalDemo;

    /**
     * description: 根据id查询用户
     * creat: mal
     * date: 2019/10/24
     */
    @PostMapping("/select")
    public SysUser selectById(@RequestBody SysUser sysUser) {
        return sysUserService.selectById(sysUser.getId());
    }

    /**
     * description: 事务demo
     * creat: mal
     * date: 2019/10/28
     */
    @GetMapping("/insertTrans")
    @Transactional(rollbackFor = Exception.class)
    public void insertSysUser() {
        sysUserService.insertSysUser();
        transactionalDemo.insertSysUser();
    }


}
