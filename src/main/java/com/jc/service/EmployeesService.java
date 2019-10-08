package com.jc.service;

import com.jc.entity.Employees;
import com.jc.entity.PageBean;
import org.springframework.stereotype.Service;


public interface EmployeesService {

    //查询
    public PageBean<Employees> listEmployees (int currentPage, int limit, String name);


    //删除
    public boolean deleteEmployees(int id);


    //指定查询

    public Employees loadEmployees(int id);

    //修改

    public boolean updateEmployees(Employees employees);

    //添加

    public boolean addEmployeest(Employees employees);

}
