package com.group.special_work_exam.examination.dao;

import com.group.special_work_exam.examination.bean.ExamQuestion;

import java.util.List;

import java.util.Map;

public interface ExamQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestion record);

    int insertSelective(ExamQuestion record);

    ExamQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestion record);

    int updateByPrimaryKey(ExamQuestion record);


    List<ExamQuestion> findByProvinceTypeId(Map map);

    Integer findCount(Integer provinceTypeId);

}