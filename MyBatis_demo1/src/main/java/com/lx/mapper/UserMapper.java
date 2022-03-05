package com.lx.mapper;

import com.lx.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();
    int updateUser();
    int deleteUser();
    User getByUserId();
    List<User> getAllUser();
}
