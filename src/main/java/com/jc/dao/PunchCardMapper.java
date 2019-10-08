package com.jc.dao;

import com.jc.entity.PunchCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PunchCardMapper {

    //查询
    List<PunchCard> listPunchCard(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    PunchCard findById(int id);


    //添加

    boolean insertPunchCard(PunchCard punchCard);
}
