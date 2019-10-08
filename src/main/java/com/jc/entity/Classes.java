package com.jc.entity;

public class Classes {

    private int id;
    private String staffCode;
    private String designation;
    private String morningShift;
    private String afternoonTime;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMorningShift() {
        return morningShift;
    }

    public void setMorningShift(String morningShift) {
        this.morningShift = morningShift;
    }

    public String getAfternoonTime() {
        return afternoonTime;
    }

    public void setAfternoonTime(String afternoonTime) {
        this.afternoonTime = afternoonTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Classes() {
    }

    public Classes(int id) {
        this.id = id;
    }


    public Classes(int id, String staffCode, String designation, String morningShift, String afternoonTime, String remark) {
        this.id = id;
        this.staffCode = staffCode;
        this.designation = designation;
        this.morningShift = morningShift;
        this.afternoonTime = afternoonTime;
        this.remark = remark;
    }
}
