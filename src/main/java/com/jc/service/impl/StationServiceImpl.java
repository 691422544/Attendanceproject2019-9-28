package com.jc.service.impl;

import com.jc.dao.StationMapper;
import com.jc.entity.PageBean;
import com.jc.entity.Station;
import com.jc.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationMapper mapper;


    @Override
    public PageBean<Station> listStation(int currentPage, int limit, String name) {
        PageBean<Station> rolePageBean = new PageBean<>();
        List<Station> rs = mapper.listStation((currentPage-1)*limit, limit, name);
        rolePageBean.setData(rs);
        rolePageBean.setCount(mapper.getCountTotal(name));
        return rolePageBean;
    }

    @Override
    public boolean deleteStation(int id) {
        return mapper.deleteStation(id);
    }

    @Override
    public Station loadStation(int id) {
        return mapper.findById(id);
    }

    @Override
    public boolean updateStation(Station station) {
        return mapper.updateStation(station);
    }

    @Override
    public boolean addStation(Station station) {
        return mapper.insertStation(station);
    }
}
