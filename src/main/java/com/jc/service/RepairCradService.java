package com.jc.service;

import com.jc.entity.PageBean;
import com.jc.entity.RepairCrad;

public interface RepairCradService {

    //查询
    public PageBean<RepairCrad> listRepairCrad (int currentPage, int limit, String name);


    //删除
    public boolean deleteRepairCrad(int id);


    //指定查询

    public RepairCrad loadRepairCrad(int id);

    //修改

    public boolean updateRepairCrad(RepairCrad repairCrad);

    //添加

    public boolean addRepairCrad(RepairCrad repairCrad);
}
