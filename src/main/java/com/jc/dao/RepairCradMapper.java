package com.jc.dao;

import com.jc.entity.RepairCrad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepairCradMapper {

    //查询
    List<RepairCrad> listRepairCrad(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    RepairCrad findById(int id);

    //修改

    boolean updateRepairCrad(RepairCrad repairCrad);

    //删除
    boolean deleteRepairCrad(int id);

    //添加

    boolean insertRepairCrad(RepairCrad repairCrad);
}
