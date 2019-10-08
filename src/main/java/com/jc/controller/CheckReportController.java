package com.jc.controller;

import com.jc.entity.CheckReport;
import com.jc.entity.PageBean;
import com.jc.service.CheckReportService;
import com.jc.until.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/checkReport")
public class CheckReportController {

    @Autowired
    private CheckReportService service;

    // 查询全部
    @RequestMapping("/list")
    @ResponseBody
    public ResultMap listCheckReport(String page, String limit, String name) {
        int page1 = Integer.valueOf(page);
        int limit1 = Integer.valueOf(limit);
        PageBean<CheckReport> employeesPageBean =  service.listCheckReport(page1,limit1,name);
        return ResultMap.ok(employeesPageBean.getData(), employeesPageBean.getCount());
    }

    // 查询指定信息
    @RequestMapping("/load")
    public String loadCheckReport(int id, Model model) {
        CheckReport employees = service.loadCheckReport(id);
        model.addAttribute("list",employees);
        return "/loadCheckReport";
    }

    //添加
    @RequestMapping("/addcheckReport")
    @ResponseBody
    public ResultMap addCheckReport(CheckReport employees) {
        return ResultMap.ok(service.addCheckReport(employees));
    }


}
