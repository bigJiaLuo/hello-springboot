package com.fjl.service.impl;

import com.fjl.bean.User;
import com.fjl.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

    @Test
    public void findAll() {
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("123");
        user.setPassword("134");
        boolean b = userService.insertUser(user);
        System.out.println(b);
    }

    @Test
    public void deleteUser() {
//        boolean b = userService.deleteUser("19");
//        System.out.println(b);
    }

    @Test
    public void selectOne() {
        User user = userService.selectOne("1");
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2);
        user.setPassword("321");
        user.setUsername("qwe");
        user.setRole("admin");
        boolean b = userService.updateUser(user);
        System.out.println(b);
    }
}