package com.group.special_work_exam.power.dao;

import com.group.special_work_exam.power.bean.PowerMenu;

public interface PowerMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(PowerMenu record);

    int insertSelective(PowerMenu record);

    PowerMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(PowerMenu record);

    int updateByPrimaryKey(PowerMenu record);
}