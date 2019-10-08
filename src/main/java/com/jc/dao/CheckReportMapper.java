package com.jc.dao;

import com.jc.entity.CheckReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckReportMapper {

    //查询
    List<CheckReport> listCheckReport(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    CheckReport findById(int id);

    //修改

    boolean updateCheckReport(CheckReport classes);

    //删除
    boolean deleteCheckReport(int id);

    //添加

    boolean insertCheckReport(CheckReport classes);
}
