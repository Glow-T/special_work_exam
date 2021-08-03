package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class WongCollectRecord implements Serializable {
    private String collectRecodeId;

    private Integer collectUserid;

    private Date collectTime;

    private Integer collectType;

    private Integer collectQuestionid;

    private static final long serialVersionUID = 1L;

    public String getCollectRecodeId() {
        return collectRecodeId;
    }

    public void setCollectRecodeId(String collectRecodeId) {
        this.collectRecodeId = collectRecodeId == null ? null : collectRecodeId.trim();
    }

    public Integer getCollectUserid() {
        return collectUserid;
    }

    public void setCollectUserid(Integer collectUserid) {
        this.collectUserid = collectUserid;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getCollectType() {
        return collectType;
    }

    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    public Integer getCollectQuestionid() {
        return collectQuestionid;
    }

    public void setCollectQuestionid(Integer collectQuestionid) {
        this.collectQuestionid = collectQuestionid;
    }
}