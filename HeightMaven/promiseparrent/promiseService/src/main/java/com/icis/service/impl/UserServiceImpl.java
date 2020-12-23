package com.icis.service.impl;

import com.icis.mapper.UserMapper;
import com.icis.pojo.Province;
import com.icis.pojo.User;
import com.icis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public Province getProvinceById(Integer pid) {
        return userMapper.getProvinceById(pid);
    }
}
