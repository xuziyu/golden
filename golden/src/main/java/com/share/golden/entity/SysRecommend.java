package com.share.golden.entity;

import java.util.Date;

public class SysRecommend {
    private String recommendId;

    private String beRecommendedId;

    private String beRecommendName;

    private String referrerId;

    private Integer recommendBouns;

    private Date recommendTime;

    private String auditorId;

    private String auditTime;

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId == null ? null : recommendId.trim();
    }

    public String getBeRecommendedId() {
        return beRecommendedId;
    }

    public void setBeRecommendedId(String beRecommendedId) {
        this.beRecommendedId = beRecommendedId == null ? null : beRecommendedId.trim();
    }

    public String getBeRecommendName() {
        return beRecommendName;
    }

    public void setBeRecommendName(String beRecommendName) {
        this.beRecommendName = beRecommendName == null ? null : beRecommendName.trim();
    }

    public String getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(String referrerId) {
        this.referrerId = referrerId == null ? null : referrerId.trim();
    }

    public Integer getRecommendBouns() {
        return recommendBouns;
    }

    public void setRecommendBouns(Integer recommendBouns) {
        this.recommendBouns = recommendBouns;
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }
}