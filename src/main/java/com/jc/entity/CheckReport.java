package com.jc.entity;

public class CheckReport {

    private int id;
    private String staffCode;
    private String name;
    private String morningShift;
    private String afternoonTime;
    private String attendance;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public CheckReport() {
    }

    public CheckReport(int id) {
        this.id = id;
    }

    public CheckReport(int id, String staffCode, String name, String morningShift, String afternoonTime, String attendance) {
        this.id = id;
        this.staffCode = staffCode;
        this.name = name;
        this.morningShift = morningShift;
        this.afternoonTime = afternoonTime;
        this.attendance = attendance;
    }
}
