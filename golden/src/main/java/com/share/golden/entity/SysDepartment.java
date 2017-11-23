package com.share.golden.entity;

import java.util.Date;

public class SysDepartment {
    private String departmentId;

    private String parentDepartmentId;

    private String departmentName;

    private Date departmentTime;

    private String departmentStatus;

    private String departmentEscribes;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId == null ? null : parentDepartmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Date getDepartmentTime() {
        return departmentTime;
    }

    public void setDepartmentTime(Date departmentTime) {
        this.departmentTime = departmentTime;
    }

    public String getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(String departmentStatus) {
        this.departmentStatus = departmentStatus == null ? null : departmentStatus.trim();
    }

    public String getDepartmentEscribes() {
        return departmentEscribes;
    }

    public void setDepartmentEscribes(String departmentEscribes) {
        this.departmentEscribes = departmentEscribes == null ? null : departmentEscribes.trim();
    }
}