package com.share.golden.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserRealName {
    private String realId;

    private String userId;

    private String realName;

    private String gender;

    private String identityNum;

    private Date attestationDate;

    private BigDecimal check;

    private Date brithDate;

    private String placeOfDomicile;

    private String theFrontOfIdCard;

    private String theBackOfIdCard;

    private String auditor;

    private String auditorId;

    public String getRealId() {
        return realId;
    }

    public void setRealId(String realId) {
        this.realId = realId == null ? null : realId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    public Date getAttestationDate() {
        return attestationDate;
    }

    public void setAttestationDate(Date attestationDate) {
        this.attestationDate = attestationDate;
    }

    public BigDecimal getCheck() {
        return check;
    }

    public void setCheck(BigDecimal check) {
        this.check = check;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(Date brithDate) {
        this.brithDate = brithDate;
    }

    public String getPlaceOfDomicile() {
        return placeOfDomicile;
    }

    public void setPlaceOfDomicile(String placeOfDomicile) {
        this.placeOfDomicile = placeOfDomicile == null ? null : placeOfDomicile.trim();
    }

    public String getTheFrontOfIdCard() {
        return theFrontOfIdCard;
    }

    public void setTheFrontOfIdCard(String theFrontOfIdCard) {
        this.theFrontOfIdCard = theFrontOfIdCard == null ? null : theFrontOfIdCard.trim();
    }

    public String getTheBackOfIdCard() {
        return theBackOfIdCard;
    }

    public void setTheBackOfIdCard(String theBackOfIdCard) {
        this.theBackOfIdCard = theBackOfIdCard == null ? null : theBackOfIdCard.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }
}