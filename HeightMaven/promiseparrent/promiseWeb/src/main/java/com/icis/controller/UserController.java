package com.icis.controller;

import com.icis.pojo.Province;
import com.icis.pojo.User;
import com.icis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/uid")
    public User getUserById(Integer id){
        User user= userService.getUserById(id);
        System.out.println(user);
        return user;
    }
    @RequestMapping("/province")
    public Province getProvinceById(Integer pid){
        Province province=userService. getProvinceById(pid);
        System.out.println(province);
        return province;
    }
}
