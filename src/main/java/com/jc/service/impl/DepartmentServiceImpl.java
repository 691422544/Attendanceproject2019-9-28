package com.jc.service.impl;

import com.jc.dao.DepartmentMapper;
import com.jc.entity.Department;
import com.jc.entity.PageBean;
import com.jc.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper mapper;

    @Override
    public PageBean<Department> listDepartment(int currentPage, int limit, String name) {
        PageBean<Department> rolePageBean = new PageBean<>();
        List<Department> rs = mapper.listDepartment((currentPage-1)*limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public boolean deleteDepartment(int id) {
        return mapper.deleteDepartment(id);
    }

    @Override
    public Department loadDepartment(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return mapper.updateDepartment(department);
    }

    @Override
    public boolean addDepartment(Department department) {
        return mapper.insertDepartment(department);
    }



}
