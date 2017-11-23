package com.share.golden.entity;

public class UserContact {
	private String contactId;

	private String userId;

	private String contactType;

	private String contactPeople;

	private String telphoneNumber;

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId == null ? null : contactId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType == null ? null : contactType.trim();
	}

	public String getContactPeople() {
		return contactPeople;
	}

	public void setContactPeople(String contactPeople) {
		this.contactPeople = contactPeople == null ? null : contactPeople.trim();
	}

	public String getTelphoneNumber() {
		return telphoneNumber;
	}

	public void setTelphoneNumber(String telphoneNumber) {
		this.telphoneNumber = telphoneNumber == null ? null : telphoneNumber.trim();
	}
}