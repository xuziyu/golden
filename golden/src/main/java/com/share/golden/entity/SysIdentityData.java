package com.share.golden.entity;

import java.util.Date;

public class SysIdentityData {
	private String id;

	private String identityNum;

	private String trueName;

	private String placeOfDomicile;

	private Date brithDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getIdentityNum() {
		return identityNum;
	}

	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum == null ? null : identityNum.trim();
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName == null ? null : trueName.trim();
	}

	public String getPlaceOfDomicile() {
		return placeOfDomicile;
	}

	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile == null ? null : placeOfDomicile.trim();
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}
}