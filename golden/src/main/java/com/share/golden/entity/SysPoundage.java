package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SysPoundage {
    private String poundageId;

    private String userId;

    private BigDecimal poundageServiceMoney;

    private String poundageType;

    private Date time;

    private String localaccount;

    private String bookaccount;

    private String paytype;

    public String getPoundageId() {
        return poundageId;
    }

    public void setPoundageId(String poundageId) {
        this.poundageId = poundageId == null ? null : poundageId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getPoundageServiceMoney() {
        return poundageServiceMoney;
    }

    public void setPoundageServiceMoney(BigDecimal poundageServiceMoney) {
        this.poundageServiceMoney = poundageServiceMoney;
    }

    public String getPoundageType() {
        return poundageType;
    }

    public void setPoundageType(String poundageType) {
        this.poundageType = poundageType == null ? null : poundageType.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocalaccount() {
        return localaccount;
    }

    public void setLocalaccount(String localaccount) {
        this.localaccount = localaccount == null ? null : localaccount.trim();
    }

    public String getBookaccount() {
        return bookaccount;
    }

    public void setBookaccount(String bookaccount) {
        this.bookaccount = bookaccount == null ? null : bookaccount.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }
}