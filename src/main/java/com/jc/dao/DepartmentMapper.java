package com.jc.dao;

import com.jc.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    //查询
    List<Department> listDepartment(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    Department findById(int id);

    //修改

    boolean updateDepartment(Department department);

    //删除
    boolean deleteDepartment(int id);

    //添加

    boolean insertDepartment(Department department);
}
