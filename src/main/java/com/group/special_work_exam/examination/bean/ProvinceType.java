package com.group.special_work_exam.examination.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProvinceType implements Serializable {
    private Integer provinceTypeId;

    private String typename;

    private Integer pid;

    private Integer typeStatus;

    private List<ProvinceType> list=new ArrayList<>();

    public List<ProvinceType> getList() {
        return list;
    }

    public void setList(List<ProvinceType> list) {
        this.list = list;
    }

    private static final long serialVersionUID = 1L;

    public Integer getProvinceTypeId() {
        return provinceTypeId;
    }

    public void setProvinceTypeId(Integer provinceTypeId) {
        this.provinceTypeId = provinceTypeId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(Integer typeStatus) {
        this.typeStatus = typeStatus;
    }
}