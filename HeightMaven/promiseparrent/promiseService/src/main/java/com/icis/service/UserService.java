package com.icis.service;

import com.icis.pojo.Province;
import com.icis.pojo.User;

public interface UserService {
    User getUserById(Integer id);

    Province getProvinceById(Integer pid);
}
