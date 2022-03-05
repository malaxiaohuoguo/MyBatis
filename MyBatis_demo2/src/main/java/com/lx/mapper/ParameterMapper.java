package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    //1.mapper接口中的方法参数为单个的字面量类型
    User getUserByUsername(String username);

    //2.若mapper接口中的方法参数为多个时
    User checkLogin(String username,String password);

    //3.map集合类型的参数    mapper接口中的方法需要的参数为多个时
    User checkLoginByMap(Map<String,Object> map);

    //4.mapper接口中的方法参数为实体类对象
    int insertUser(User user);

    //5.使用@Param标识参数   通过@Param注解标识mapper接口中的方法参数
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
