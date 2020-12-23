package com.icis.mapper;

import com.icis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //根据用户id查询用户
    @Select("select * from user where id=${uid}")
    public User getUserById(Integer uid);
    @Select("select * from user")
    List<User> getAllUser();

}
