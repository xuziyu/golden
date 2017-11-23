package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BasTenderInformation {
	private String tenderId;

	private String userId;

	private String markcount;

	private String lmcount;

	private String gmcount;

	private BigDecimal markmoney;

	private BigDecimal markgain;

	private Date markbegindate;

	private Date markenddate;

	private Date date;

	public String getTenderId() {
		return tenderId;
	}

	public void setTenderId(String tenderId) {
		this.tenderId = tenderId == null ? null : tenderId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getMarkcount() {
		return markcount;
	}

	public void setMarkcount(String markcount) {
		this.markcount = markcount == null ? null : markcount.trim();
	}

	public String getLmcount() {
		return lmcount;
	}

	public void setLmcount(String lmcount) {
		this.lmcount = lmcount == null ? null : lmcount.trim();
	}

	public String getGmcount() {
		return gmcount;
	}

	public void setGmcount(String gmcount) {
		this.gmcount = gmcount == null ? null : gmcount.trim();
	}

	public BigDecimal getMarkmoney() {
		return markmoney;
	}

	public void setMarkmoney(BigDecimal markmoney) {
		this.markmoney = markmoney;
	}

	public BigDecimal getMarkgain() {
		return markgain;
	}

	public void setMarkgain(BigDecimal markgain) {
		this.markgain = markgain;
	}

	public Date getMarkbegindate() {
		return markbegindate;
	}

	public void setMarkbegindate(Date markbegindate) {
		this.markbegindate = markbegindate;
	}

	public Date getMarkenddate() {
		return markenddate;
	}

	public void setMarkenddate(Date markenddate) {
		this.markenddate = markenddate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}