package com.share.golden.entity;

public class SysVip {
    private String vipId;

    private String userId;

    private String vipState;

    private String userCredit;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId == null ? null : vipId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getVipState() {
        return vipState;
    }
    
    public void setVipState(String vipState) {
        this.vipState = vipState == null ? null : vipState.trim();
    }

    public String getUserCredit() {
        return userCredit;
    }

    public void setUserCredit(String userCredit) {
        this.userCredit = userCredit == null ? null : userCredit.trim();
    }
}