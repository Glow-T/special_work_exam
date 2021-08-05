package com.group.special_work_exam.simrecord.dao;

import com.group.special_work_exam.simrecord.bean.SimulateRecord;

public interface SimulateRecordMapper {
    int deleteByPrimaryKey(String simulateRecordId);

    int insert(SimulateRecord record);

    int insertSelective(SimulateRecord record);

    SimulateRecord selectByPrimaryKey(String simulateRecordId);

    int updateByPrimaryKeySelective(SimulateRecord record);

    int updateByPrimaryKey(SimulateRecord record);
}