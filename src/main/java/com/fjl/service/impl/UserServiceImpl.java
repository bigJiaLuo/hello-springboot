package com.fjl.service.impl;

import com.fjl.bean.User;
import com.fjl.mapper.UserMapper;
import com.fjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TOOD
 *
 * @author luo
 * @version 1.0
 * @date 2020/5/19 10:42
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public User login(String username, String password) {
        return userMapper.getInfo(username,password);
    }
}
