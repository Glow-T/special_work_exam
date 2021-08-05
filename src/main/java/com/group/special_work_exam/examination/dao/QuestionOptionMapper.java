package com.group.special_work_exam.examination.dao;

import com.group.special_work_exam.examination.bean.QuestionOption;

public interface QuestionOptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionOption record);

    int insertSelective(QuestionOption record);

    QuestionOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionOption record);

    int updateByPrimaryKeyWithBLOBs(QuestionOption record);

    int updateByPrimaryKey(QuestionOption record);
}