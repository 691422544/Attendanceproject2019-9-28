package com.jc.service.impl;

import com.jc.dao.CheckReportMapper;
import com.jc.entity.CheckReport;
import com.jc.entity.PageBean;
import com.jc.service.CheckReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckReportServiceImpl implements CheckReportService {

    @Autowired
    private CheckReportMapper mapper;


    @Override
    public PageBean<CheckReport> listCheckReport(int currentPage, int limit, String name) {
        PageBean<CheckReport> rolePageBean = new PageBean<>();
        List<CheckReport> rs = mapper.listCheckReport((currentPage - 1) * limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public boolean deleteCheckReport(int id) {
        return false;
    }

    @Override
    public CheckReport loadCheckReport(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateCheckReport(CheckReport checkReport) {
        return false;
    }

    @Override
    public boolean addCheckReport(CheckReport checkReport) {
        return mapper.insertCheckReport(checkReport);
    }
}
