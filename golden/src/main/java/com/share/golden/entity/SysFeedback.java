package com.share.golden.entity;

import java.util.Date;

public class SysFeedback {
    private String feedbackId;

    private String feedbackName;

    private String feedbackConent;

    private Date feedbackTime;

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId == null ? null : feedbackId.trim();
    }

    public String getFeedbackName() {
        return feedbackName;
    }

    public void setFeedbackName(String feedbackName) {
        this.feedbackName = feedbackName == null ? null : feedbackName.trim();
    }

    public String getFeedbackConent() {
        return feedbackConent;
    }

    public void setFeedbackConent(String feedbackConent) {
        this.feedbackConent = feedbackConent == null ? null : feedbackConent.trim();
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }
}