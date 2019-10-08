package com.jc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RepairCrad {

    private int id;
    private String repairPeople;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date repairDate;
    private String cause;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepairPeople() {
        return repairPeople;
    }

    public void setRepairPeople(String repairPeople) {
        this.repairPeople = repairPeople;
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public RepairCrad() {
    }

    public RepairCrad(int id) {
        this.id = id;
    }

    public RepairCrad(int id, String repairPeople, Date repairDate, String cause) {
        this.id = id;
        this.repairPeople = repairPeople;
        this.repairDate = repairDate;
        this.cause = cause;
    }

}
