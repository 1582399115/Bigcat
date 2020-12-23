package com.icis.mapper;

import com.icis.pojo.Province;
import com.icis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    User getUserById(Integer id);

    Province getProvinceById(Integer pid);
}
