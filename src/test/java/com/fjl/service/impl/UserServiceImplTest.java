package com.fjl.service.impl;

import com.fjl.bean.User;
import com.fjl.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Test
    void login() {
        User zhangsan = userService.login("zhangsan", "123");
        System.out.println(zhangsan);
    }
}