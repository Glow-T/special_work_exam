package com.group.special_work_exam.power.dao;

import com.group.special_work_exam.power.bean.PowerRoleMenu;

public interface PowerRoleMenuMapper {
    int deleteByPrimaryKey(Integer rmId);

    int insert(PowerRoleMenu record);

    int insertSelective(PowerRoleMenu record);

    PowerRoleMenu selectByPrimaryKey(Integer rmId);

    int updateByPrimaryKeySelective(PowerRoleMenu record);

    int updateByPrimaryKey(PowerRoleMenu record);
}