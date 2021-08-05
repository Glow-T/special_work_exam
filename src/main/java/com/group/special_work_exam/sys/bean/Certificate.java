package com.group.special_work_exam.sys.bean;

import java.io.Serializable;
import java.util.Date;

public class Certificate implements Serializable {
    private Integer certificateId;

    private String certificateTitle;

    private String certificateDesc;

    private Date certificateBegindate;

    private Date certificateEnddate;

    private Integer certificateState;

    private Integer certificateUserid;

    private Date certificateCreatetime;

    private static final long serialVersionUID = 1L;

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle == null ? null : certificateTitle.trim();
    }

    public String getCertificateDesc() {
        return certificateDesc;
    }

    public void setCertificateDesc(String certificateDesc) {
        this.certificateDesc = certificateDesc == null ? null : certificateDesc.trim();
    }

    public Date getCertificateBegindate() {
        return certificateBegindate;
    }

    public void setCertificateBegindate(Date certificateBegindate) {
        this.certificateBegindate = certificateBegindate;
    }

    public Date getCertificateEnddate() {
        return certificateEnddate;
    }

    public void setCertificateEnddate(Date certificateEnddate) {
        this.certificateEnddate = certificateEnddate;
    }

    public Integer getCertificateState() {
        return certificateState;
    }

    public void setCertificateState(Integer certificateState) {
        this.certificateState = certificateState;
    }

    public Integer getCertificateUserid() {
        return certificateUserid;
    }

    public void setCertificateUserid(Integer certificateUserid) {
        this.certificateUserid = certificateUserid;
    }

    public Date getCertificateCreatetime() {
        return certificateCreatetime;
    }

    public void setCertificateCreatetime(Date certificateCreatetime) {
        this.certificateCreatetime = certificateCreatetime;
    }
}