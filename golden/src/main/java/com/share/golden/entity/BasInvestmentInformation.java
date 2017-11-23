package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BasInvestmentInformation {
    private String investorId;

    private String userId;

    private String tenderId;

    private BigDecimal investorMoney;

    private String investorStatus;

    private String investorStyle;

    private String brrowStatus;

    private String investorRest;

    private String profitModel;

    private BigDecimal profitMoney;

    private Date investorDate;

    private String replayDate;

    private String investorType;

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId == null ? null : investorId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTenderId() {
        return tenderId;
    }

    public void setTenderId(String tenderId) {
        this.tenderId = tenderId == null ? null : tenderId.trim();
    }

    public BigDecimal getInvestorMoney() {
        return investorMoney;
    }

    public void setInvestorMoney(BigDecimal investorMoney) {
        this.investorMoney = investorMoney;
    }

    public String getInvestorStatus() {
        return investorStatus;
    }

    public void setInvestorStatus(String investorStatus) {
        this.investorStatus = investorStatus == null ? null : investorStatus.trim();
    }

    public String getInvestorStyle() {
        return investorStyle;
    }

    public void setInvestorStyle(String investorStyle) {
        this.investorStyle = investorStyle == null ? null : investorStyle.trim();
    }

    public String getBrrowStatus() {
        return brrowStatus;
    }

    public void setBrrowStatus(String brrowStatus) {
        this.brrowStatus = brrowStatus == null ? null : brrowStatus.trim();
    }

    public String getInvestorRest() {
        return investorRest;
    }

    public void setInvestorRest(String investorRest) {
        this.investorRest = investorRest == null ? null : investorRest.trim();
    }

    public String getProfitModel() {
        return profitModel;
    }

    public void setProfitModel(String profitModel) {
        this.profitModel = profitModel == null ? null : profitModel.trim();
    }

    public BigDecimal getProfitMoney() {
        return profitMoney;
    }

    public void setProfitMoney(BigDecimal profitMoney) {
        this.profitMoney = profitMoney;
    }

    public Date getInvestorDate() {
        return investorDate;
    }

    public void setInvestorDate(Date investorDate) {
        this.investorDate = investorDate;
    }

    public String getReplayDate() {
        return replayDate;
    }

    public void setReplayDate(String replayDate) {
        this.replayDate = replayDate == null ? null : replayDate.trim();
    }

    public String getInvestorType() {
        return investorType;
    }

    public void setInvestorType(String investorType) {
        this.investorType = investorType == null ? null : investorType.trim();
    }
}