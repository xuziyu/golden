package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserWithdraw {
	private String withdrawId;

	private String withdrawAccount;

	private String withdrawBank;

	private BigDecimal withdrawMoney;

	private BigDecimal realMoney;

	private BigDecimal withdrawServiceCharge;

	private Date withdrawTime;

	private Date intoTime;

	private String withdrawState;

	private String auditorId;

	private String auditor;

	private Date auditTime;

	private String remark;

	public String getWithdrawId() {
		return withdrawId;
	}

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId == null ? null : withdrawId.trim();
	}

	public String getWithdrawAccount() {
		return withdrawAccount;
	}

	public void setWithdrawAccount(String withdrawAccount) {
		this.withdrawAccount = withdrawAccount == null ? null : withdrawAccount.trim();
	}

	public String getWithdrawBank() {
		return withdrawBank;
	}

	public void setWithdrawBank(String withdrawBank) {
		this.withdrawBank = withdrawBank == null ? null : withdrawBank.trim();
	}

	public BigDecimal getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(BigDecimal withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	public BigDecimal getRealMoney() {
		return realMoney;
	}

	public void setRealMoney(BigDecimal realMoney) {
		this.realMoney = realMoney;
	}

	public BigDecimal getWithdrawServiceCharge() {
		return withdrawServiceCharge;
	}

	public void setWithdrawServiceCharge(BigDecimal withdrawServiceCharge) {
		this.withdrawServiceCharge = withdrawServiceCharge;
	}

	public Date getWithdrawTime() {
		return withdrawTime;
	}

	public void setWithdrawTime(Date withdrawTime) {
		this.withdrawTime = withdrawTime;
	}

	public Date getIntoTime() {
		return intoTime;
	}

	public void setIntoTime(Date intoTime) {
		this.intoTime = intoTime;
	}

	public String getWithdrawState() {
		return withdrawState;
	}

	public void setWithdrawState(String withdrawState) {
		this.withdrawState = withdrawState == null ? null : withdrawState.trim();
	}

	public String getAuditorId() {
		return auditorId;
	}

	public void setAuditorId(String auditorId) {
		this.auditorId = auditorId == null ? null : auditorId.trim();
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor == null ? null : auditor.trim();
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}