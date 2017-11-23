package com.share.golden.entity;

import java.util.Date;

public class BasRepayment {
    private String repayId;

    private String repayCode;

    private Date repayDate;

    private String repayState;

    private String repayTime;

    private String repayRemark1;

    private String repayRemark2;

    public String getRepayId() {
        return repayId;
    }

    public void setRepayId(String repayId) {
        this.repayId = repayId == null ? null : repayId.trim();
    }

    public String getRepayCode() {
        return repayCode;
    }

    public void setRepayCode(String repayCode) {
        this.repayCode = repayCode == null ? null : repayCode.trim();
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public String getRepayState() {
        return repayState;
    }

    public void setRepayState(String repayState) {
        this.repayState = repayState == null ? null : repayState.trim();
    }

    public String getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(String repayTime) {
        this.repayTime = repayTime == null ? null : repayTime.trim();
    }

    public String getRepayRemark1() {
        return repayRemark1;
    }

    public void setRepayRemark1(String repayRemark1) {
        this.repayRemark1 = repayRemark1 == null ? null : repayRemark1.trim();
    }

    public String getRepayRemark2() {
        return repayRemark2;
    }

    public void setRepayRemark2(String repayRemark2) {
        this.repayRemark2 = repayRemark2 == null ? null : repayRemark2.trim();
    }
}