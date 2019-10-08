package com.jc.service;

import com.jc.entity.CheckReport;
import com.jc.entity.PageBean;

public interface CheckReportService {

    //查询
    public PageBean<CheckReport> listCheckReport (int currentPage, int limit, String name);


    //删除
    public boolean deleteCheckReport(int id);


    //指定查询

    public CheckReport loadCheckReport(int id);

    //修改

    public boolean updateCheckReport(CheckReport checkReport);

    //添加

    public boolean addCheckReport(CheckReport checkReport);
}
