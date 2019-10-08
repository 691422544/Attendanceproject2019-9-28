package com.jc.controller;


import com.jc.entity.PageBean;
import com.jc.entity.RepairCrad;
import com.jc.service.RepairCradService;
import com.jc.until.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/repairCrad")
public class RepairCradController {

    @Autowired
    private RepairCradService service;

    // 查询全部
    @RequestMapping("/list")
    @ResponseBody
    public ResultMap listRepairCrad(String page, String limit, String name) {
        int page1 = Integer.valueOf(page);
        int limit1 = Integer.valueOf(limit);
        PageBean<RepairCrad> employeesPageBean =  service.listRepairCrad(page1,limit1,name);
        return ResultMap.ok(employeesPageBean.getData(), employeesPageBean.getCount());
    }

    // 查询指定信息
    @RequestMapping("/load")
    public String loadRepairCrad(int id, Model model) {
        RepairCrad employees = service.loadRepairCrad(id);
        model.addAttribute("list",employees);
        return "/loadRepairCrad";
    }

    //删除
    @GetMapping("/deleterepairCrad")
    @ResponseBody
    public ResultMap deleteRepairCrad(int id) {

        boolean b = service.deleteRepairCrad(id);
        return ResultMap.ok(b);
    }

    //修改
    @RequestMapping("/updaterepairCrad")
    @ResponseBody
    public ResultMap updateRepairCrad(RepairCrad employees) {

        boolean b = service.updateRepairCrad(employees);
        if (b){

            return ResultMap.ok(null);
        }
        return ResultMap.fail(null);
    }


    //添加
    @RequestMapping("/addrepairCrad")
    @ResponseBody
    public ResultMap addRepairCrad(RepairCrad employees) {
        return ResultMap.ok(service.addRepairCrad(employees));
    }


}
