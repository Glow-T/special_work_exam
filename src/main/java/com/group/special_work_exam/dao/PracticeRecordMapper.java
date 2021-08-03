package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.PracticeRecord;

import java.util.List;

public interface PracticeRecordMapper {
    int deleteByPrimaryKey(String practiceRecordId);

    int insert(PracticeRecord record);

    int insertSelective(PracticeRecord record);

    PracticeRecord selectByPrimaryKey(String practiceRecordId);

    int updateByPrimaryKeySelective(PracticeRecord record);

    int updateByPrimaryKey(PracticeRecord record);

    List<PracticeRecord> findByUserId(Integer userId);

    Integer findCountByUserId(Integer userId);
}