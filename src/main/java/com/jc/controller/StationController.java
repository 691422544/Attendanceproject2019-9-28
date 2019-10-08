package com.jc.controller;


import com.jc.entity.PageBean;
import com.jc.entity.Station;
import com.jc.service.StationService;
import com.jc.until.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/station")
public class StationController {

    @Autowired
    private StationService service;


    // 查询全部
    @RequestMapping("/list")
    @ResponseBody
    public ResultMap listStation(String page, String limit, String name) {
        int page1 = Integer.valueOf(page);
        int limit1 = Integer.valueOf(limit);
        PageBean<Station> employeesPageBean =  service.listStation(page1,limit1,name);
        return ResultMap.ok(employeesPageBean.getData(), employeesPageBean.getCount());
    }

    // 查询指定信息
    @RequestMapping("/load")
    public String loadStation(int id, Model model) {
        Station station = service.loadStation(id);
        model.addAttribute("list",station);
        return "/loadStation";
    }


    //删除
    @GetMapping("/deletestation")
    @ResponseBody
    public ResultMap deleteStation(int id) {

        boolean b = service.deleteStation(id);
        return ResultMap.ok(b);
    }


    //修改
    @RequestMapping("/updatestation")
    @ResponseBody
    public ResultMap updateStation(Station station) {

        boolean b = service.updateStation(station);
        if (b){

            return ResultMap.ok(null);
        }
        return ResultMap.fail(null);
    }


    //添加
    @RequestMapping("/addstation")
    @ResponseBody
    public ResultMap addStationt(Station station) {
        return ResultMap.ok(service.addStation(station));
    }
}
