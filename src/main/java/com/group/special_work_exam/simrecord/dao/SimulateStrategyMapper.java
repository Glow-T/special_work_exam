package com.group.special_work_exam.simrecord.dao;

import com.group.special_work_exam.simrecord.bean.SimulateStrategy;

public interface SimulateStrategyMapper {
    int deleteByPrimaryKey(Integer strategyId);

    int insert(SimulateStrategy record);

    int insertSelective(SimulateStrategy record);

    SimulateStrategy selectByPrimaryKey(Integer strategyId);

    int updateByPrimaryKeySelective(SimulateStrategy record);

    int updateByPrimaryKey(SimulateStrategy record);
}