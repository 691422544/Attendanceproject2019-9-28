package com.jc.service;

import com.jc.entity.PageBean;
import com.jc.entity.PunchCard;

public interface PunchCardService {

    //查询
    public PageBean<PunchCard> listPunchCard (int currentPage, int limit, String name);


    //指定查询

    public PunchCard loadPunchCard(int id);

    //添加

    public boolean addPunchCard(PunchCard punchCard);
}
