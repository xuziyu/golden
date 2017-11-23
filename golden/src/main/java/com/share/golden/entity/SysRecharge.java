package com.share.golden.entity;

import java.util.Date;

public class SysRecharge {
    private String rechargeId;

    private String rechargeCode;

    private String userId;

    private String rechargeType;

    private String rechargeMoney;

    private Date rechargeTime;

    private String rechargeStatu;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    public String getRechargeCode() {
        return rechargeCode;
    }

    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode == null ? null : rechargeCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType == null ? null : rechargeType.trim();
    }

    public String getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(String rechargeMoney) {
        this.rechargeMoney = rechargeMoney == null ? null : rechargeMoney.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getRechargeStatu() {
        return rechargeStatu;
    }

    public void setRechargeStatu(String rechargeStatu) {
        this.rechargeStatu = rechargeStatu == null ? null : rechargeStatu.trim();
    }
}