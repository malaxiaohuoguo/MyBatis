package com.lx.mapper;

import com.lx.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    //多条件查询
    List<Emp> getEmpByCondition(Emp emp);

    //choose、when、otherwise
    List<Emp> getEmpByChoose(Emp emp);

    //通过数组实现批量删除
    //在映射文件里如何访问这个Integer[]数组呢?
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    //通过List集合实现批量添加
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
