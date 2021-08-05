package com.group.special_work_exam.simrecord.bean;

import java.io.Serializable;
import java.util.Date;

public class PracticeRecord implements Serializable {
    private String practiceRecordId;

    private Integer questionid;

    private Date practiceTime;

    private Integer userid;

    private String practiceAnswer;

    private Integer practiceIsright;

    private static final long serialVersionUID = 1L;

    public String getPracticeRecordId() {
        return practiceRecordId;
    }

    public void setPracticeRecordId(String practiceRecordId) {
        this.practiceRecordId = practiceRecordId == null ? null : practiceRecordId.trim();
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Date getPracticeTime() {
        return practiceTime;
    }

    public void setPracticeTime(Date practiceTime) {
        this.practiceTime = practiceTime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPracticeAnswer() {
        return practiceAnswer;
    }

    public void setPracticeAnswer(String practiceAnswer) {
        this.practiceAnswer = practiceAnswer == null ? null : practiceAnswer.trim();
    }

    public Integer getPracticeIsright() {
        return practiceIsright;
    }

    public void setPracticeIsright(Integer practiceIsright) {
        this.practiceIsright = practiceIsright;
    }
}