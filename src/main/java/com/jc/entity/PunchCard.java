package com.jc.entity;

public class PunchCard {

    private int id;
    private String clockOne;
    private String clockTnDate;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClockOne() {
        return clockOne;
    }

    public void setClockOne(String clockOne) {
        this.clockOne = clockOne;
    }

    public String getClockTnDate() {
        return clockTnDate;
    }

    public void setClockTnDate(String clockTnDate) {
        this.clockTnDate = clockTnDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PunchCard() {
    }

    public PunchCard(int id) {
        this.id = id;
    }

    public PunchCard(int id, String clockOne, String clockTnDate, String remark) {
        this.id = id;
        this.clockOne = clockOne;
        this.clockTnDate = clockTnDate;
        this.remark = remark;
    }
}
