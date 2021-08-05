package com.group.special_work_exam.wallet.bean;

import java.io.Serializable;
import java.util.Date;

public class GoodsVipSaleRecord implements Serializable {
    private Integer saleId;

    private Integer goodsvipId;

    private Integer userid;

    private String payType;

    private Float payTotal;

    private Date saleTime;

    private Integer saleState;

    private String tradeNo;

    private static final long serialVersionUID = 1L;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getGoodsvipId() {
        return goodsvipId;
    }

    public void setGoodsvipId(Integer goodsvipId) {
        this.goodsvipId = goodsvipId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Float getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(Float payTotal) {
        this.payTotal = payTotal;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleState() {
        return saleState;
    }

    public void setSaleState(Integer saleState) {
        this.saleState = saleState;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }
}