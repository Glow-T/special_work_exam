package com.group.special_work_exam.bean;

import java.io.Serializable;

public class ExamQuestionWithBLOBs extends ExamQuestion implements Serializable {
    private String stem;

    private String analysis;

    private static final long serialVersionUID = 1L;

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}