package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.ExamQuestionWithBLOBs;

public interface ExamQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestionWithBLOBs record);

    int insertSelective(ExamQuestionWithBLOBs record);

    ExamQuestionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamQuestionWithBLOBs record);

    int updateByPrimaryKey(ExamQuestion record);
}