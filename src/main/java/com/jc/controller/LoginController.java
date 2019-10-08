package com.jc.controller;

import com.jc.entity.Login;
import com.jc.service.LoginService;
import com.jc.until.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @RequestMapping("/listlogin")
    @ResponseBody
    public ResultMap listLogin(String username, String password){

        Login login = service.listLogin(new Login(username,password));

        if (login != null){
            return ResultMap.ok(null);
        }else {
            return ResultMap.fail(null);
        }
    }

}
