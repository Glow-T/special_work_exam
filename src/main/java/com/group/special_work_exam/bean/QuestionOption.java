package com.group.special_work_exam.bean;

import java.io.Serializable;

public class QuestionOption implements Serializable {
    private Integer id;

    private String optionpre;

    private Integer isanswer;

    private Integer questionid;

    private Integer orders;

    private String optiontxt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptionpre() {
        return optionpre;
    }

    public void setOptionpre(String optionpre) {
        this.optionpre = optionpre == null ? null : optionpre.trim();
    }

    public Integer getIsanswer() {
        return isanswer;
    }

    public void setIsanswer(Integer isanswer) {
        this.isanswer = isanswer;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getOptiontxt() {
        return optiontxt;
    }

    public void setOptiontxt(String optiontxt) {
        this.optiontxt = optiontxt == null ? null : optiontxt.trim();
    }
}