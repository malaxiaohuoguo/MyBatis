package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    //1.根据id查询
    User getUserById(@Param("id") Integer id);

    //2.查询所有用户信息
    List<User> getAllUser();

    //3.查询用户信息总记录数
    Integer getCount();

    //4.根据id查询用户信息为一个map集合  查询的结果以字段为键，以字段的值为值
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    //5.查询所有用户信息为map集合
    //List<Map<String,Object>> getAllUserByToMap();
    @MapKey("id")
    Map<String,Object> getAllUserByToMap();

}
