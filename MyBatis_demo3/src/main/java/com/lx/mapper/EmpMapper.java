package com.lx.mapper;

import com.lx.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    //查询所有员工信息
    List<Emp> getAllEmp();

    //查询员工及所对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer eid);
}
