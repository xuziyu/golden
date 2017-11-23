package com.share.golden.entity;

public class BasBorrowMoney {
    private String borrowId;

    private String borrowSerial;

    private String userId;

    private String borrowCompany;

    private String borrowMoney;

    private String borrowRate;

    private String timeLimit;

    private String borrowLimit;

    private String borrowState;

    private String borrowRecommend;

    private String borrowType;

    private String borrowRemark1;

    private String borrowRemark2;

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId == null ? null : borrowId.trim();
    }

    public String getBorrowSerial() {
        return borrowSerial;
    }

    public void setBorrowSerial(String borrowSerial) {
        this.borrowSerial = borrowSerial == null ? null : borrowSerial.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBorrowCompany() {
        return borrowCompany;
    }

    public void setBorrowCompany(String borrowCompany) {
        this.borrowCompany = borrowCompany == null ? null : borrowCompany.trim();
    }

    public String getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(String borrowMoney) {
        this.borrowMoney = borrowMoney == null ? null : borrowMoney.trim();
    }

    public String getBorrowRate() {
        return borrowRate;
    }

    public void setBorrowRate(String borrowRate) {
        this.borrowRate = borrowRate == null ? null : borrowRate.trim();
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(String borrowLimit) {
        this.borrowLimit = borrowLimit == null ? null : borrowLimit.trim();
    }

    public String getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(String borrowState) {
        this.borrowState = borrowState == null ? null : borrowState.trim();
    }

    public String getBorrowRecommend() {
        return borrowRecommend;
    }

    public void setBorrowRecommend(String borrowRecommend) {
        this.borrowRecommend = borrowRecommend == null ? null : borrowRecommend.trim();
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public String getBorrowRemark1() {
        return borrowRemark1;
    }

    public void setBorrowRemark1(String borrowRemark1) {
        this.borrowRemark1 = borrowRemark1 == null ? null : borrowRemark1.trim();
    }

    public String getBorrowRemark2() {
        return borrowRemark2;
    }

    public void setBorrowRemark2(String borrowRemark2) {
        this.borrowRemark2 = borrowRemark2 == null ? null : borrowRemark2.trim();
    }
}