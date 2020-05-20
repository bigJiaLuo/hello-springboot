package com.fjl.controller;

import com.fjl.bean.User;
import com.fjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    /**
     * 查询所有用户，返回 带有用户数据的页面视图
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findAll();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("users");
        return modelAndView;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public Map<String, Object> addUser(User user){
        HashMap<String, Object> map = new HashMap<>();
        boolean flag = userService.insertUser(user);
        if(flag){
            map.put("msg","完成添加");
            return map;
        }else{
            map.put("msg","添加失败");
            return map;
        }
    }
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
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

    @RequestMapping("/deleteUser+{id}")
    public String deleteUser(@PathVariable("id") String id, ModelMap modelMap){
        boolean flag = userService.deleteUser(id);
        List<User> users = userService.findAll();
        modelMap.addAttribute("users",users);
        if(flag){
            return "users";
        }
        return "error";
    }

    @RequestMapping("/selectOne")
    public String selectOne(String id,ModelMap modelMap){
        User user = userService.selectOne(id);
        if(user != null){
            modelMap.addAttribute("user",user);
            return "userInfo";
        }
        return "error";
    }
}
