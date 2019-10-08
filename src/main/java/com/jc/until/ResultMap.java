package com.jc.until;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class ResultMap {

    private String msg;
    private Integer code;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Object data;
    private int count;




    public ResultMap(String msg, Integer code, Object data, int count) {
        this.msg = msg;
        this.code = code;
        this.data = data;
        this.count = count;

    }

    public ResultMap(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getdata() {
        return data;
    }

    public void setdata(Object data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static ResultMap ok(Object data){
        return  new ResultMap("成功",200,data);
    }

    public static ResultMap fail(Object data){
        return  new ResultMap("失败",500,data);
    }


    public static ResultMap ok(Object data,int count){
        return  new ResultMap("成功",0,data,count);
    }
}



