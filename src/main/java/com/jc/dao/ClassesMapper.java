package com.jc.dao;

import com.jc.entity.Classes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassesMapper {
    //查询
    List<Classes> listClasses(@Param("currentPage") int currentPage, @Param("limit") int limit, @Param("name") String name);


    //查询总条数

    Integer getCountTotal(@Param("name") String name);


    //指定查询
    Classes findById(int id);

    //修改

    boolean updateClasses(Classes classes);

    //删除
    boolean deleteClasses(int id);

    //添加

    boolean insertClasses(Classes classes);
}
