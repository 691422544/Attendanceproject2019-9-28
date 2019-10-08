package com.jc.entity;

public class Station {

    private int id;
    private String staffCode;
    private String post;
    private String department;
    private String superior;
    private String jobCategory;
    private String detail;

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Station() {
    }

    public Station(int id) {
        this.id = id;
    }

    public Station(int id, String staffCode, String post, String department, String superior, String jobCategory, String detail) {
        this.id = id;
        this.staffCode = staffCode;
        this.post = post;
        this.department = department;
        this.superior = superior;
        this.jobCategory = jobCategory;
        this.detail = detail;
    }
}
