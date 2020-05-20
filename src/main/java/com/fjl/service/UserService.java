package com.fjl.service;

import com.fjl.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查询所有用户信息
     * @return List
     */
    List<User> findAll();

    /**
     * 插入user 对象
     * @param user
     * @return 成功 true
     */
    boolean insertUser(User user);

    /**
     * 删除指定 id 用户
     * @param id
     * @return
     */
    boolean deleteUser(String id);

    /**
     * 根据指定id 查找用户
     * @param id
     * @return
     */
    User selectOne(String id);
}
