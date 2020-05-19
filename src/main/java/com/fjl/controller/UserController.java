package com.fjl.controller;

import com.fjl.bean.User;
import com.fjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TOOD
 *
 * @author luo
 * @version 1.0
 * @date 2020/5/19 10:22
 */
@Controller(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam("password") String password){
        System.out.println("123");
        User login = userService.login(username, password);
        System.out.println(login);
        if(login != null)
            return "success";
        else{
            return "error";
        }
    }
}
