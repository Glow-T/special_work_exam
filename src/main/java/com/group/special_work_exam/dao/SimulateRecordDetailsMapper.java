package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.SimulateRecordDetails;

public interface SimulateRecordDetailsMapper {
    int deleteByPrimaryKey(String simulateRecordDetailsId);

    int insert(SimulateRecordDetails record);

    int insertSelective(SimulateRecordDetails record);

    SimulateRecordDetails selectByPrimaryKey(String simulateRecordDetailsId);

    int updateByPrimaryKeySelective(SimulateRecordDetails record);

    int updateByPrimaryKey(SimulateRecordDetails record);
}