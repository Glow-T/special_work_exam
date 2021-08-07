package com.group.special_work_exam.uservip.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String nickname;

    private String headimg;

    private String phone;

    private String openid;

    private Integer departmentid;

    private Integer classesid;

    private Integer enrollmentyear;

    private Date createtime;

    private Integer state;

    private String realname;

    private String wxpay;

    private Integer isrealname;

    private String sex;

    private String studentid;

    private Integer usertype;

    private String password;

    private String idcard;

    private String province;

    private Integer age;

    private UserVip userVip;

    private static final long serialVersionUID = 1L;

    public UserVip getUserVip() {
        return userVip;
    }

    public void setUserVip(UserVip userVip) {
        this.userVip = userVip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getClassesid() {
        return classesid;
    }

    public void setClassesid(Integer classesid) {
        this.classesid = classesid;
    }

    public Integer getEnrollmentyear() {
        return enrollmentyear;
    }

    public void setEnrollmentyear(Integer enrollmentyear) {
        this.enrollmentyear = enrollmentyear;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getWxpay() {
        return wxpay;
    }

    public void setWxpay(String wxpay) {
        this.wxpay = wxpay == null ? null : wxpay.trim();
    }

    public Integer getIsrealname() {
        return isrealname;
    }

    public void setIsrealname(Integer isrealname) {
        this.isrealname = isrealname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}