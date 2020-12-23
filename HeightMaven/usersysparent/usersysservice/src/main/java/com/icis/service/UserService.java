package com.icis.service;

import com.icis.mapper.UserMapper;
import com.icis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer uid){
        return userMapper.getUserById(uid);
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
