package com.share.golden.entity;

import java.util.Date;

public class SysLog {
    private String logId;

    private String logType;

    private String logRemark;

    private Date logProcesstime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getLogRemark() {
        return logRemark;
    }

    public void setLogRemark(String logRemark) {
        this.logRemark = logRemark == null ? null : logRemark.trim();
    }

    public Date getLogProcesstime() {
        return logProcesstime;
    }

    public void setLogProcesstime(Date logProcesstime) {
        this.logProcesstime = logProcesstime;
    }
}