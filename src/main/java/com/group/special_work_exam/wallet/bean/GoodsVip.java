package com.group.special_work_exam.wallet.bean;

import java.io.Serializable;

public class GoodsVip implements Serializable {
    private Integer goodsvipId;

    private String goodsvipName;

    private Integer goodsvipTime;

    private Float goodsvipPrice;

    private Integer goodsvipPtypeId;

    private Integer goodsvipState;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsvipId() {
        return goodsvipId;
    }

    public void setGoodsvipId(Integer goodsvipId) {
        this.goodsvipId = goodsvipId;
    }

    public String getGoodsvipName() {
        return goodsvipName;
    }

    public void setGoodsvipName(String goodsvipName) {
        this.goodsvipName = goodsvipName == null ? null : goodsvipName.trim();
    }

    public Integer getGoodsvipTime() {
        return goodsvipTime;
    }

    public void setGoodsvipTime(Integer goodsvipTime) {
        this.goodsvipTime = goodsvipTime;
    }

    public Float getGoodsvipPrice() {
        return goodsvipPrice;
    }

    public void setGoodsvipPrice(Float goodsvipPrice) {
        this.goodsvipPrice = goodsvipPrice;
    }

    public Integer getGoodsvipPtypeId() {
        return goodsvipPtypeId;
    }

    public void setGoodsvipPtypeId(Integer goodsvipPtypeId) {
        this.goodsvipPtypeId = goodsvipPtypeId;
    }

    public Integer getGoodsvipState() {
        return goodsvipState;
    }

    public void setGoodsvipState(Integer goodsvipState) {
        this.goodsvipState = goodsvipState;
    }
}