package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class SimulateRecordDetails implements Serializable {
    private String simulateRecordDetailsId;

    private String srecordid;

    private Integer questionid;

    private String myanswer;

    private Integer isright;

    private Date answertime;

    private Integer ordernum;

    private static final long serialVersionUID = 1L;

    public String getSimulateRecordDetailsId() {
        return simulateRecordDetailsId;
    }

    public void setSimulateRecordDetailsId(String simulateRecordDetailsId) {
        this.simulateRecordDetailsId = simulateRecordDetailsId == null ? null : simulateRecordDetailsId.trim();
    }

    public String getSrecordid() {
        return srecordid;
    }

    public void setSrecordid(String srecordid) {
        this.srecordid = srecordid == null ? null : srecordid.trim();
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getMyanswer() {
        return myanswer;
    }

    public void setMyanswer(String myanswer) {
        this.myanswer = myanswer == null ? null : myanswer.trim();
    }

    public Integer getIsright() {
        return isright;
    }

    public void setIsright(Integer isright) {
        this.isright = isright;
    }

    public Date getAnswertime() {
        return answertime;
    }

    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }
}