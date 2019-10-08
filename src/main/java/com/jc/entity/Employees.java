package com.jc.entity;

public class Employees {
    private int id;
    private String staffCode;
    private String name;
    private String sex;
    private int age;
    private String post;
    private String ethnic;
    private String identityCard;
    private String salary;
    private String contactNumber;
    private String emergencyContact;
    private String emergencyNumber;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Employees() {
    }

    public Employees(int id) {
        this.id = id;
    }

    public Employees(int id, String staffCode, String name, String sex, int age, String post, String ethnic, String identityCard, String salary, String contactNumber, String emergencyContact, String emergencyNumber, String detail) {
        this.id = id;
        this.staffCode = staffCode;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.post = post;
        this.ethnic = ethnic;
        this.identityCard = identityCard;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.emergencyContact = emergencyContact;
        this.emergencyNumber = emergencyNumber;
        this.detail = detail;
    }
}
