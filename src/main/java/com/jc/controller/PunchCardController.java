package com.jc.controller;


import com.jc.entity.PageBean;
import com.jc.entity.PunchCard;
import com.jc.service.PunchCardService;
import com.jc.until.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/punchcard")
public class PunchCardController {

    @Autowired
    private PunchCardService service;

    // 查询全部
    @RequestMapping("/list")
    @ResponseBody
    public ResultMap listPunchCard(String page, String limit, String name) {
        int page1 = Integer.valueOf(page);
        int limit1 = Integer.valueOf(limit);
        PageBean<PunchCard> employeesPageBean =  service.listPunchCard(page1,limit1,name);
        return ResultMap.ok(employeesPageBean.getData(), employeesPageBean.getCount());
    }

    // 查询指定信息
    @RequestMapping("/load")
    public String loadPunchCard(int id, Model model) {
        PunchCard employees = service.loadPunchCard(id);
        model.addAttribute("list",employees);
        return "/loadPunchCard";
    }

    //添加
    @RequestMapping("/addpunchcard")
    @ResponseBody
    public ResultMap addPunchCard(PunchCard punchCard) {
        return ResultMap.ok(service.addPunchCard(punchCard));
    }
}
