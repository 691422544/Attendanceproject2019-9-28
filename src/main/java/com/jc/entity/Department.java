package com.jc.entity;

public class Department {

    private int id;
    private String staffCode;
    private String industryTitle;
    private String departmentHead;
    private String responsibility;
    private String superior;
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

    public String getIndustryTitle() {
        return industryTitle;
    }

    public void setIndustryTitle(String industryTitle) {
        this.industryTitle = industryTitle;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Department() {
    }

    public Department(int id) {
        this.id = id;
    }


    public Department(int id, String staffCode, String industryTitle, String departmentHead, String responsibility, String superior, String remark) {
        this.id = id;
        this.staffCode = staffCode;
        this.industryTitle = industryTitle;
        this.departmentHead = departmentHead;
        this.responsibility = responsibility;
        this.superior = superior;
        this.remark = remark;
    }
}
