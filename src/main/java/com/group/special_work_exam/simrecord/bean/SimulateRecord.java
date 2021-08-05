package com.group.special_work_exam.simrecord.bean;

import java.io.Serializable;
import java.util.Date;

public class SimulateRecord implements Serializable {
    private String simulateRecordId;

    private Integer srecordUserid;

    private Integer srecordStrategyid;

    private Float srecordScore;

    private Date srecordBegintime;

    private Date srecordEndtime;

    private Integer srecordPtypeid;

    private Float srecordAccuracy;

    private Integer srecordState;

    private static final long serialVersionUID = 1L;

    public String getSimulateRecordId() {
        return simulateRecordId;
    }

    public void setSimulateRecordId(String simulateRecordId) {
        this.simulateRecordId = simulateRecordId == null ? null : simulateRecordId.trim();
    }

    public Integer getSrecordUserid() {
        return srecordUserid;
    }

    public void setSrecordUserid(Integer srecordUserid) {
        this.srecordUserid = srecordUserid;
    }

    public Integer getSrecordStrategyid() {
        return srecordStrategyid;
    }

    public void setSrecordStrategyid(Integer srecordStrategyid) {
        this.srecordStrategyid = srecordStrategyid;
    }

    public Float getSrecordScore() {
        return srecordScore;
    }

    public void setSrecordScore(Float srecordScore) {
        this.srecordScore = srecordScore;
    }

    public Date getSrecordBegintime() {
        return srecordBegintime;
    }

    public void setSrecordBegintime(Date srecordBegintime) {
        this.srecordBegintime = srecordBegintime;
    }

    public Date getSrecordEndtime() {
        return srecordEndtime;
    }

    public void setSrecordEndtime(Date srecordEndtime) {
        this.srecordEndtime = srecordEndtime;
    }

    public Integer getSrecordPtypeid() {
        return srecordPtypeid;
    }

    public void setSrecordPtypeid(Integer srecordPtypeid) {
        this.srecordPtypeid = srecordPtypeid;
    }

    public Float getSrecordAccuracy() {
        return srecordAccuracy;
    }

    public void setSrecordAccuracy(Float srecordAccuracy) {
        this.srecordAccuracy = srecordAccuracy;
    }

    public Integer getSrecordState() {
        return srecordState;
    }

    public void setSrecordState(Integer srecordState) {
        this.srecordState = srecordState;
    }
}