package com.jc.service.impl;

import com.jc.dao.LoginMapper;
import com.jc.entity.Login;
import com.jc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl implements LoginService {

    @Autowired

    private LoginMapper mapper;
    @Override
    public Login listLogin(Login login) {
        return mapper.listLogin(login);
    }
}
