package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class SysSetting implements Serializable {
    private Integer settingId;

    private String settingName;

    private Integer settingValue;

    private Date settingCreatetime;

    private String settingModifyuser;

    private Date settingModifytime;

    private static final long serialVersionUID = 1L;

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName == null ? null : settingName.trim();
    }

    public Integer getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(Integer settingValue) {
        this.settingValue = settingValue;
    }

    public Date getSettingCreatetime() {
        return settingCreatetime;
    }

    public void setSettingCreatetime(Date settingCreatetime) {
        this.settingCreatetime = settingCreatetime;
    }

    public String getSettingModifyuser() {
        return settingModifyuser;
    }

    public void setSettingModifyuser(String settingModifyuser) {
        this.settingModifyuser = settingModifyuser == null ? null : settingModifyuser.trim();
    }

    public Date getSettingModifytime() {
        return settingModifytime;
    }

    public void setSettingModifytime(Date settingModifytime) {
        this.settingModifytime = settingModifytime;
    }
}