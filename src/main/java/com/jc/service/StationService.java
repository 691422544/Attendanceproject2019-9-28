package com.jc.service;

import com.jc.entity.PageBean;
import com.jc.entity.Station;

public interface StationService {

    //查询
    public PageBean<Station> listStation (int currentPage, int limit, String name);


    //删除
    public boolean deleteStation(int id);


    //指定查询

    public Station loadStation(int id);

    //修改

    public boolean updateStation(Station station);

    //添加

    public boolean addStation(Station station);
}
