package com.lx.mapper;

import com.lx.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    //获取部门以及部门中所有员工的信息
    Dept getDeptAndEmp(@Param("did") Integer did);
}
