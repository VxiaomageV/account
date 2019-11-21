package com.example.account.service;

import com.example.account.dao.SysUserMapper;
import com.example.account.po.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 用户处理
 * @author: mal
 * @date: 2019/10/24
 */
public interface SysUserService {

    /**
     * description: 根据id查询用户
     * creat: mal
     * date: 2019/10/22
     */
    SysUser selectById(int id);

    /**
     * description: 事务demo 读写提交 新建事务
     * creat: mal
     * date: 2019/10/28
     */
    public void insertSysUser();

}
