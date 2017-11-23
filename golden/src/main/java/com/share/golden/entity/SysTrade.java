package com.share.golden.entity;

import java.util.Date;

public class SysTrade {
	private String tradeId;

	private String userI;

	private String tradeMoney;

	private String tradeType;

	private Date tradeTime;

	private String tradeRemark;

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId == null ? null : tradeId.trim();
	}

	public String getUserI() {
		return userI;
	}

	public void setUserI(String userI) {
		this.userI = userI == null ? null : userI.trim();
	}

	public String getTradeMoney() {
		return tradeMoney;
	}

	public void setTradeMoney(String tradeMoney) {
		this.tradeMoney = tradeMoney == null ? null : tradeMoney.trim();
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType == null ? null : tradeType.trim();
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeRemark() {
		return tradeRemark;
	}

	public void setTradeRemark(String tradeRemark) {
		this.tradeRemark = tradeRemark == null ? null : tradeRemark.trim();
	}
}