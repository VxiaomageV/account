package com.example.account.service.impl;

import com.example.account.dao.SysUserMapper;
import com.example.account.po.SysUser;
import com.example.account.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: mal
 * @date: 2019/10/24
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysUserServiceImpl implements SysUserService {


    @Autowired
    SysUserMapper sysUserMapper;

    /**
     * description: 根据id查询用户
     * creat: mal
     * date: 2019/10/22
     */
    @Override
    public SysUser selectById(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    /**
     * description: 事务demo 读写提交 新建事务
     * creat: mal
     * date: 2019/10/28
     *
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void insertSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setCode("wle");
        sysUser.setName("吴老二");
        sysUserMapper.insertSelective(sysUser);
    }


}
