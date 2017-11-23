package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserApplyForLimit {
    private String applyCode;

    private String userId;

    private BigDecimal originalCredit;

    private String houseOfProperty;

    private BigDecimal applyLimit;

    private Date applyDate;

    private String applyState;

    private String checkId;

    private String vaild;

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getOriginalCredit() {
        return originalCredit;
    }

    public void setOriginalCredit(BigDecimal originalCredit) {
        this.originalCredit = originalCredit;
    }

    public String getHouseOfProperty() {
        return houseOfProperty;
    }

    public void setHouseOfProperty(String houseOfProperty) {
        this.houseOfProperty = houseOfProperty == null ? null : houseOfProperty.trim();
    }

    public BigDecimal getApplyLimit() {
        return applyLimit;
    }

    public void setApplyLimit(BigDecimal applyLimit) {
        this.applyLimit = applyLimit;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState == null ? null : applyState.trim();
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getVaild() {
        return vaild;
    }

    public void setVaild(String vaild) {
        this.vaild = vaild == null ? null : vaild.trim();
    }
}