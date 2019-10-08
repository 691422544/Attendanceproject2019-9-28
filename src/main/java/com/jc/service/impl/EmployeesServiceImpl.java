package com.jc.service.impl;

import com.jc.dao.EmployeesMapper;
import com.jc.entity.Employees;
import com.jc.entity.PageBean;
import com.jc.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesMapper mapper;
    @Override
    public PageBean<Employees> listEmployees(int currentPage, int limit, String name) {
        PageBean<Employees> rolePageBean = new PageBean<>();
        List<Employees> rs = mapper.listEmployees((currentPage-1)*limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;

    }

    @Override
    public boolean deleteEmployees(int id) {
        return mapper.deleteEmployees(id);
    }

    @Override
    public Employees loadEmployees(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateEmployees(Employees employees) {
        return mapper.updateEmployees(employees);
    }

    @Override
    public boolean addEmployeest(Employees employees) {
        return mapper.insertEmployees(employees);
    }


}
