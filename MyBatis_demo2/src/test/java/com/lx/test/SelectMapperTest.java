package com.lx.test;

import com.lx.mapper.ParameterMapper;
import com.lx.mapper.SelectMapper;
import com.lx.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(1));
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUser());
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(1));
    }

    @Test
    public void testGetAllUserByToMap(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUserByToMap());
    }
}
