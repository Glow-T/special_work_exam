package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.PracticeRecord;

public interface PracticeRecordMapper {
    int deleteByPrimaryKey(String practiceRecordId);

    int insert(PracticeRecord record);

    int insertSelective(PracticeRecord record);

    PracticeRecord selectByPrimaryKey(String practiceRecordId);

    int updateByPrimaryKeySelective(PracticeRecord record);

    int updateByPrimaryKey(PracticeRecord record);
}