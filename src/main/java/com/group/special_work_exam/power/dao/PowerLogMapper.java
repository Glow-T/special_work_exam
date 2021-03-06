package com.group.special_work_exam.power.dao;

import com.group.special_work_exam.power.bean.PowerLog;

public interface PowerLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(PowerLog record);

    int insertSelective(PowerLog record);

    PowerLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(PowerLog record);

    int updateByPrimaryKeyWithBLOBs(PowerLog record);

    int updateByPrimaryKey(PowerLog record);
}