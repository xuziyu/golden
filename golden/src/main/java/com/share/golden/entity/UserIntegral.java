package com.share.golden.entity;

import java.math.BigDecimal;

public class UserIntegral {
    private String cuserId;

    private String userId;

    private BigDecimal creditPoint;

    private BigDecimal memberPoint;

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId == null ? null : cuserId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(BigDecimal creditPoint) {
        this.creditPoint = creditPoint;
    }

    public BigDecimal getMemberPoint() {
        return memberPoint;
    }

    public void setMemberPoint(BigDecimal memberPoint) {
        this.memberPoint = memberPoint;
    }
}