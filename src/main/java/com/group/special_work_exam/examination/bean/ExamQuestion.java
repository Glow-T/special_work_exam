package com.group.special_work_exam.examination.bean;

import com.group.special_work_exam.simrecord.bean.PracticeRecord;
import com.group.special_work_exam.simrecord.bean.WongCollectRecord;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ExamQuestion implements Serializable {
    private Integer id;

    private String stem;

    private String typecode;

    private String answer;

    private String analysis;

    private Date createdate;

    private Long createuser;

    private Float points;

    private Integer orders;

    private Integer unitid;

    private Integer pid;

    private List<QuestionOption> option;

    private PracticeRecord practiceRecord;

    private WongCollectRecord wongCollectRecord;

    public PracticeRecord getPracticeRecord() {
        return practiceRecord;
    }

    public void setPracticeRecord(PracticeRecord practiceRecord) {
        this.practiceRecord = practiceRecord;
    }

    public WongCollectRecord getWongCollectRecord() {
        return wongCollectRecord;
    }

    public void setWongCollectRecord(WongCollectRecord wongCollectRecord) {
        this.wongCollectRecord = wongCollectRecord;
    }

    public List<QuestionOption> getOption() {
        return option;
    }

    public void setOption(List<QuestionOption> option) {
        this.option = option;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    private Unit unit;

    private QuestionType questionType;

    private static final long serialVersionUID = 1L;

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Long createuser) {
        this.createuser = createuser;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}