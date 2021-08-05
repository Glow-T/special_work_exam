package com.group.special_work_exam.simrecord.dao;

import com.group.special_work_exam.simrecord.bean.PracticeRecord;

import java.util.List;
import java.util.Map;

public interface PracticeRecordMapper {
    int deleteByPrimaryKey(String practiceRecordId);

    int insert(PracticeRecord record);

    int insertSelective(PracticeRecord record);

    PracticeRecord selectByPrimaryKey(String practiceRecordId);

    int updateByPrimaryKeySelective(PracticeRecord record);

    int updateByPrimaryKey(PracticeRecord record);

    List<PracticeRecord> findHistory(Integer userId,Integer provinceTypeId);

    int findCount(Map map);
}