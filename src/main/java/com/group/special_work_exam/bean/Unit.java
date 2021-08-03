package com.group.special_work_exam.bean;

import java.io.Serializable;

public class Unit implements Serializable {
    private Integer unitid;

    private String unitname;

    private Integer unitpid;

    private Integer unitstate;

    private Integer provincetypeid;

    private static final long serialVersionUID = 1L;

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public Integer getUnitpid() {
        return unitpid;
    }

    public void setUnitpid(Integer unitpid) {
        this.unitpid = unitpid;
    }

    public Integer getUnitstate() {
        return unitstate;
    }

    public void setUnitstate(Integer unitstate) {
        this.unitstate = unitstate;
    }

    public Integer getProvincetypeid() {
        return provincetypeid;
    }

    public void setProvincetypeid(Integer provincetypeid) {
        this.provincetypeid = provincetypeid;
    }
}