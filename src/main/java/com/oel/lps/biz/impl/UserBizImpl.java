package com.oel.lps.biz.impl;

import com.oel.lps.biz.IUserBiz;
import com.oel.lps.mapper.UserMapper;
import com.oel.lps.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserName(String username) {
        return userMapper.queryUserName(username);
    }
}
