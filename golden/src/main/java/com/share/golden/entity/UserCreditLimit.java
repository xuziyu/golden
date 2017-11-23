package com.share.golden.entity;

public class UserCreditLimit {
	private String limitCode;

	private String userId;

	private String creditLimit;

	private String creditGrade;

	public String getLimitCode() {
		return limitCode;
	}

	public void setLimitCode(String limitCode) {
		this.limitCode = limitCode == null ? null : limitCode.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit == null ? null : creditLimit.trim();
	}

	public String getCreditGrade() {
		return creditGrade;
	}

	public void setCreditGrade(String creditGrade) {
		this.creditGrade = creditGrade == null ? null : creditGrade.trim();
	}
}