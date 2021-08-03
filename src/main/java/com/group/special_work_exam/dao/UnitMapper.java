package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer unitid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer unitid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}