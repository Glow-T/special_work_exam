package com.group.special_work_exam.simrecord.dao;

import com.group.special_work_exam.simrecord.bean.SimulateRecordDetails;

import java.util.List;

public interface SimulateRecordDetailsMapper {
    int deleteByPrimaryKey(String simulateRecordDetailsId);

    int insert(SimulateRecordDetails record);

    int insertSelective(SimulateRecordDetails record);

    SimulateRecordDetails selectByPrimaryKey(String simulateRecordDetailsId);

    int updateByPrimaryKeySelective(SimulateRecordDetails record);

    int updateByPrimaryKey(SimulateRecordDetails record);

    List<SimulateRecordDetails>selelctErr(Integer userId);
}