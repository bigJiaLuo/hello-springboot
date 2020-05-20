package com.fjl.mapper;

import com.fjl.bean.User;

import java.util.List;

/**
 * TOOD
 *
 * @author luo
 * @version 1.0
 * @date 2020/5/19 10:28
 */
public interface UserMapper{
    User getInfo(String username,String password);

    /**
     * 查询所有用户信息，封装进List集合
     * @return
     */
    List<User> findAll();

    /**
     *  将user对象插入 到用户表中
     * @param user
     * @return 成功 true
     */
    boolean insertUser(User user);

    /**
     * 删除指定 id 的用户记录
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
