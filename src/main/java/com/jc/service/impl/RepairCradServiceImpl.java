package com.jc.service.impl;

import com.jc.dao.RepairCradMapper;
import com.jc.entity.PageBean;
import com.jc.entity.RepairCrad;
import com.jc.service.RepairCradService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairCradServiceImpl implements RepairCradService {

    @Autowired
    private RepairCradMapper mapper;


    @Override
    public PageBean<RepairCrad> listRepairCrad(int currentPage, int limit, String name) {
        PageBean<RepairCrad> rolePageBean = new PageBean<>();
        List<RepairCrad> rs = mapper.listRepairCrad((currentPage-1)*limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public boolean deleteRepairCrad(int id) {
        return mapper.deleteRepairCrad(id);
    }

    @Override
    public RepairCrad loadRepairCrad(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateRepairCrad(RepairCrad repairCrad) {
        return mapper.updateRepairCrad(repairCrad);
    }

    @Override
    public boolean addRepairCrad(RepairCrad repairCrad) {
        return mapper.insertRepairCrad(repairCrad);
    }
}
