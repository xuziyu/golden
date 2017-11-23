package com.share.golden.entity;

import java.math.BigDecimal;

public class UserAccountAssets {
    private BigDecimal accountId;

    private String userId;

    private String accountBalance;

    private String accountFreeze;

    private String accountDue;

    private String accountPaid;

    private String totalMoney;

    public BigDecimal getAccountId() {
        return accountId;
    }

    public void setAccountId(BigDecimal accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance == null ? null : accountBalance.trim();
    }

    public String getAccountFreeze() {
        return accountFreeze;
    }

    public void setAccountFreeze(String accountFreeze) {
        this.accountFreeze = accountFreeze == null ? null : accountFreeze.trim();
    }

    public String getAccountDue() {
        return accountDue;
    }

    public void setAccountDue(String accountDue) {
        this.accountDue = accountDue == null ? null : accountDue.trim();
    }

    public String getAccountPaid() {
        return accountPaid;
    }

    public void setAccountPaid(String accountPaid) {
        this.accountPaid = accountPaid == null ? null : accountPaid.trim();
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney == null ? null : totalMoney.trim();
    }
}