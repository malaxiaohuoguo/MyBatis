package com.lx.test;

import com.lx.mapper.ParameterMapper;
import com.lx.pojo.User;
import com.lx.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterMapperTest {

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        List<User> list=mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    /*1*/
    @Test
    public void getUserByUsername(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user= mapper.getUserByUsername("aaa");
        System.out.println(user);
    }

    /*2*/
    @Test
    public void testcheckLogin(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user= mapper.checkLogin("aaa","aaa");
        System.out.println(user);
    }

    /*3*/
    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object> map= new HashMap<>();
        map.put("username","aaa");
        map.put("password","aaa");
        User user= mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    /*4*/
    @Test
    public void testInsertUser(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        int result= mapper.insertUser(new User(null,"sss","sss",11,"男","sss@qq.com"));
        System.out.println(result);
    }

    /*5*/
    @Test
    public void testcheckLoginByParam(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user= mapper.checkLoginByParam("aaa","aaa");
        System.out.println(user);
    }
}
