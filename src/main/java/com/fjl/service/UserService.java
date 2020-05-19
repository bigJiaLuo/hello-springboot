package com.fjl.service;

import com.fjl.bean.User;
import com.fjl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TOOD
 *
 * @author luo
 * @version 1.0
 * @date 2020/5/19 10:39
 */
@Service
public interface UserService {
    /**
     *  根据用户名密码登录
     * @param username
     * @param password
     * @return 用户对象
     */
    User login(String username,String password);
}
