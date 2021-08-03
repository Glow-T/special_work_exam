package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.QuestionType;

public interface QuestionTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionType record);

    int insertSelective(QuestionType record);

    QuestionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionType record);

    int updateByPrimaryKey(QuestionType record);
}