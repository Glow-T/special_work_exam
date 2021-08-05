package com.group.special_work_exam.wallet.bean;

import java.io.Serializable;
import java.util.Date;

public class CashOut implements Serializable {
    private Integer cashoutid;

    private Integer userid;

    private Float money;

    private Date createtime;

    private Integer status;

    private Integer opmanagerid;

    private String reson;

    private Date optime;

    private String remark;

    private String alipay;

    private String alipayname;

    private static final long serialVersionUID = 1L;

    public Integer getCashoutid() {
        return cashoutid;
    }

    public void setCashoutid(Integer cashoutid) {
        this.cashoutid = cashoutid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOpmanagerid() {
        return opmanagerid;
    }

    public void setOpmanagerid(Integer opmanagerid) {
        this.opmanagerid = opmanagerid;
    }

    public String getReson() {
        return reson;
    }

    public void setReson(String reson) {
        this.reson = reson == null ? null : reson.trim();
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay == null ? null : alipay.trim();
    }

    public String getAlipayname() {
        return alipayname;
    }

    public void setAlipayname(String alipayname) {
        this.alipayname = alipayname == null ? null : alipayname.trim();
    }
}