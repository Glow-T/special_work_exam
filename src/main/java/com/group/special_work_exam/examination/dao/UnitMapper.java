package com.group.special_work_exam.examination.dao;

import com.group.special_work_exam.examination.bean.Unit;

import java.util.List;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer unitid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer unitid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

    List<Unit> findByProvinceTypeId(Integer provinceTypeId);
}