package com.group.special_work_exam.uservip.bean;

import java.io.Serializable;
import java.util.Date;

public class ShareIncome implements Serializable {
    private String shareIncomeId;

    private Float incomeTotal;

    private Float incomeMy;

    private Date incomeTime;

    private String incomeShareid;

    private static final long serialVersionUID = 1L;

    public String getShareIncomeId() {
        return shareIncomeId;
    }

    public void setShareIncomeId(String shareIncomeId) {
        this.shareIncomeId = shareIncomeId == null ? null : shareIncomeId.trim();
    }

    public Float getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(Float incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public Float getIncomeMy() {
        return incomeMy;
    }

    public void setIncomeMy(Float incomeMy) {
        this.incomeMy = incomeMy;
    }

    public Date getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public String getIncomeShareid() {
        return incomeShareid;
    }

    public void setIncomeShareid(String incomeShareid) {
        this.incomeShareid = incomeShareid == null ? null : incomeShareid.trim();
    }
}