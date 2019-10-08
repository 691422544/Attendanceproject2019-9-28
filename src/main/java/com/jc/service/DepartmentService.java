package com.jc.service;

import com.jc.entity.Department;
import com.jc.entity.PageBean;

public interface DepartmentService {

    //查询
    public PageBean<Department> listDepartment (int currentPage, int limit, String name);


    //删除
    public boolean deleteDepartment(int id);


    //指定查询

    public Department loadDepartment(int id);

    //修改

    public boolean updateDepartment(Department department);

    //添加

    public boolean addDepartment(Department department);
}
