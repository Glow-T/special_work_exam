package com.group.special_work_exam.simrecord.bean;

import java.io.Serializable;

public class SimulateStrategy implements Serializable {
    private Integer strategyId;

    private String strategyName;

    private Integer strategySingleNum;

    private Integer strategyMultipleNum;

    private Integer strategyJudgeNum;

    private Integer strategyCombinationNum;

    private Integer strategyPtypeId;

    private Integer strategyState;

    private Integer strategyTotalNum;

    private Float strategyTotalScore;

    private Float strategyPassScore;

    private Integer strategyDuration;

    private Integer strategySingleOrder;

    private Integer strategyMultipleOrder;

    private Integer strategyJudgeOrder;

    private Integer strategyCombinationOrder;

    private static final long serialVersionUID = 1L;

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName == null ? null : strategyName.trim();
    }

    public Integer getStrategySingleNum() {
        return strategySingleNum;
    }

    public void setStrategySingleNum(Integer strategySingleNum) {
        this.strategySingleNum = strategySingleNum;
    }

    public Integer getStrategyMultipleNum() {
        return strategyMultipleNum;
    }

    public void setStrategyMultipleNum(Integer strategyMultipleNum) {
        this.strategyMultipleNum = strategyMultipleNum;
    }

    public Integer getStrategyJudgeNum() {
        return strategyJudgeNum;
    }

    public void setStrategyJudgeNum(Integer strategyJudgeNum) {
        this.strategyJudgeNum = strategyJudgeNum;
    }

    public Integer getStrategyCombinationNum() {
        return strategyCombinationNum;
    }

    public void setStrategyCombinationNum(Integer strategyCombinationNum) {
        this.strategyCombinationNum = strategyCombinationNum;
    }

    public Integer getStrategyPtypeId() {
        return strategyPtypeId;
    }

    public void setStrategyPtypeId(Integer strategyPtypeId) {
        this.strategyPtypeId = strategyPtypeId;
    }

    public Integer getStrategyState() {
        return strategyState;
    }

    public void setStrategyState(Integer strategyState) {
        this.strategyState = strategyState;
    }

    public Integer getStrategyTotalNum() {
        return strategyTotalNum;
    }

    public void setStrategyTotalNum(Integer strategyTotalNum) {
        this.strategyTotalNum = strategyTotalNum;
    }

    public Float getStrategyTotalScore() {
        return strategyTotalScore;
    }

    public void setStrategyTotalScore(Float strategyTotalScore) {
        this.strategyTotalScore = strategyTotalScore;
    }

    public Float getStrategyPassScore() {
        return strategyPassScore;
    }

    public void setStrategyPassScore(Float strategyPassScore) {
        this.strategyPassScore = strategyPassScore;
    }

    public Integer getStrategyDuration() {
        return strategyDuration;
    }

    public void setStrategyDuration(Integer strategyDuration) {
        this.strategyDuration = strategyDuration;
    }

    public Integer getStrategySingleOrder() {
        return strategySingleOrder;
    }

    public void setStrategySingleOrder(Integer strategySingleOrder) {
        this.strategySingleOrder = strategySingleOrder;
    }

    public Integer getStrategyMultipleOrder() {
        return strategyMultipleOrder;
    }

    public void setStrategyMultipleOrder(Integer strategyMultipleOrder) {
        this.strategyMultipleOrder = strategyMultipleOrder;
    }

    public Integer getStrategyJudgeOrder() {
        return strategyJudgeOrder;
    }

    public void setStrategyJudgeOrder(Integer strategyJudgeOrder) {
        this.strategyJudgeOrder = strategyJudgeOrder;
    }

    public Integer getStrategyCombinationOrder() {
        return strategyCombinationOrder;
    }

    public void setStrategyCombinationOrder(Integer strategyCombinationOrder) {
        this.strategyCombinationOrder = strategyCombinationOrder;
    }
}