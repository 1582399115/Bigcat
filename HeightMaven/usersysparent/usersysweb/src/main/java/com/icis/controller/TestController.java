package com.icis.controller;

import com.icis.pojo.User;
import com.icis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class TestController {
   //注入
    @Autowired
    private UserService userService;
    //根据用户id 查询一个用户数据 maven依赖传递
    @RequestMapping("getUserById")
    public String getUserById(Integer uid){
        return "查询到用户:八戒 id:"+uid;
    }
    @RequestMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
