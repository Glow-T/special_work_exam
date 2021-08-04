package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ExamQuestion;

import java.util.List;

public interface ExamQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestion record);

    int insertSelective(ExamQuestion record);

    ExamQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestion record);

    int updateByPrimaryKey(ExamQuestion record);

    List<ExamQuestion> findByProvinceTypeId(Integer provinceTypeId);

    Integer findCount(Integer provinceTypeId);
}