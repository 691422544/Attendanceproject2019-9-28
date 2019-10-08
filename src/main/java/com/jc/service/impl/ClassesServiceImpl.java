package com.jc.service.impl;

import com.jc.dao.ClassesMapper;
import com.jc.entity.Classes;
import com.jc.entity.PageBean;
import com.jc.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper mapper;


    @Override
    public PageBean<Classes> listClasses(int currentPage, int limit, String name) {
        PageBean<Classes> rolePageBean = new PageBean<>();
        List<Classes> rs = mapper.listClasses((currentPage - 1) * limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public boolean deleteClasses(int id) {

            return mapper.deleteClasses(id);

    }

    @Override
    public Classes loadClasses(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateClasses(Classes classes) {
        return mapper.updateClasses(classes);
    }

    @Override
    public boolean addClasses(Classes classes) {
        return mapper.insertClasses(classes);
    }


}
