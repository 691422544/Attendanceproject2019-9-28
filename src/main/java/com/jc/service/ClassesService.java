package com.jc.service;

import com.jc.entity.Classes;
import com.jc.entity.PageBean;

public interface ClassesService {

    //查询
    public PageBean<Classes> listClasses (int currentPage, int limit, String name);


    //删除
    public boolean deleteClasses(int id);


    //指定查询

    public Classes loadClasses(int id);

    //修改

    public boolean updateClasses(Classes classes);

    //添加

    public boolean addClasses(Classes classes);
}
