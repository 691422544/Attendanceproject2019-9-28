package com.jc.dao;

import com.jc.entity.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeesMapper {

    //查询
    List<Employees> listEmployees(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    Employees findById(int id);

    //修改

    boolean updateEmployees(Employees employees);

    //删除
    boolean deleteEmployees(int id);

    //添加

    boolean insertEmployees(Employees employees);
}
