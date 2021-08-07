package com.group.special_work_exam.uservip.bean;

import java.io.Serializable;
import java.util.Date;

public class UserVip implements Serializable {
    private Integer uservipId;

    private Integer userid;

    private Date uservipBegintime;

    private Date uservipEndtime;

    private Integer uservipState;

    private Date uservipCreatetime;

    private Date uservipModifytime;

    private Integer uservipTypeid;

    private static final long serialVersionUID = 1L;

    public Integer getUservipId() {
        return uservipId;
    }

    public void setUservipId(Integer uservipId) {
        this.uservipId = uservipId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getUservipBegintime() {
        return uservipBegintime;
    }

    public void setUservipBegintime(Date uservipBegintime) {
        this.uservipBegintime = uservipBegintime;
    }

    public Date getUservipEndtime() {
        return uservipEndtime;
    }

    public void setUservipEndtime(Date uservipEndtime) {
        this.uservipEndtime = uservipEndtime;
    }

    public Integer getUservipState() {
        return uservipState;
    }

    public void setUservipState(Integer uservipState) {
        this.uservipState = uservipState;
    }

    public Date getUservipCreatetime() {
        return uservipCreatetime;
    }

    public void setUservipCreatetime(Date uservipCreatetime) {
        this.uservipCreatetime = uservipCreatetime;
    }

    public Date getUservipModifytime() {
        return uservipModifytime;
    }

    public void setUservipModifytime(Date uservipModifytime) {
        this.uservipModifytime = uservipModifytime;
    }

    public Integer getUservipTypeid() {
        return uservipTypeid;
    }

    public void setUservipTypeid(Integer uservipTypeid) {
        this.uservipTypeid = uservipTypeid;
    }
}