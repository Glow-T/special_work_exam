package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class WalletWater implements Serializable {
    private String walletWaterId;

    private Integer walletOption;

    private Float walletMoney;

    private String walletItem;

    private Float walletLastMoney;

    private Date walletTime;

    private Integer walletUserid;

    private static final long serialVersionUID = 1L;

    public String getWalletWaterId() {
        return walletWaterId;
    }

    public void setWalletWaterId(String walletWaterId) {
        this.walletWaterId = walletWaterId == null ? null : walletWaterId.trim();
    }

    public Integer getWalletOption() {
        return walletOption;
    }

    public void setWalletOption(Integer walletOption) {
        this.walletOption = walletOption;
    }

    public Float getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(Float walletMoney) {
        this.walletMoney = walletMoney;
    }

    public String getWalletItem() {
        return walletItem;
    }

    public void setWalletItem(String walletItem) {
        this.walletItem = walletItem == null ? null : walletItem.trim();
    }

    public Float getWalletLastMoney() {
        return walletLastMoney;
    }

    public void setWalletLastMoney(Float walletLastMoney) {
        this.walletLastMoney = walletLastMoney;
    }

    public Date getWalletTime() {
        return walletTime;
    }

    public void setWalletTime(Date walletTime) {
        this.walletTime = walletTime;
    }

    public Integer getWalletUserid() {
        return walletUserid;
    }

    public void setWalletUserid(Integer walletUserid) {
        this.walletUserid = walletUserid;
    }
}