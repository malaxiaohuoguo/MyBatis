package com.lx.test;

import com.lx.mapper.SQLMapper;
import com.lx.mapper.SelectMapper;
import com.lx.pojo.User;
import com.lx.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SQLMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper=sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("王");
        System.out.println(list);
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper=sqlSession.getMapper(SQLMapper.class);
        int result=mapper.deleteMore("4,10,14");
        System.out.println(result);
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        System.out.println(list);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user= new User(null,"lisi","123",23,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
