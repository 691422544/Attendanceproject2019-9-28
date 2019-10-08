package com.jc.service.impl;

import com.jc.dao.PunchCardMapper;
import com.jc.entity.PageBean;
import com.jc.entity.PunchCard;
import com.jc.service.PunchCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunchCardServiceImpl implements PunchCardService {


    @Autowired
    private PunchCardMapper mapper;



    @Override
    public PageBean<PunchCard> listPunchCard(int currentPage, int limit, String name) {
        PageBean<PunchCard> rolePageBean = new PageBean<>();
        List<PunchCard> rs = mapper.listPunchCard((currentPage-1)*limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public PunchCard loadPunchCard(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean addPunchCard(PunchCard punchCard) {
        return mapper.insertPunchCard(punchCard);
    }
}
