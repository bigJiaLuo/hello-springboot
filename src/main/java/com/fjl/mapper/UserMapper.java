package com.fjl.mapper;

import com.fjl.bean.User;

/**
 * TOOD
 *
 * @author luo
 * @version 1.0
 * @date 2020/5/19 10:28
 */
public interface UserMapper{
    User getInfo(String username,String password);
}
