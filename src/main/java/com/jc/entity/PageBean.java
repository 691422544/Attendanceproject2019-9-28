package com.jc.entity;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private Integer count;
    //    private Integer currentPage;
//    private Integer pageSize;
//    private Integer pageTotal;
    private List<T> data = new ArrayList<>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
