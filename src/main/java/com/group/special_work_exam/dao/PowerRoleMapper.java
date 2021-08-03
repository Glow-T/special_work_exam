package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.PowerRole;

public interface PowerRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(PowerRole record);

    int insertSelective(PowerRole record);

    PowerRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(PowerRole record);

    int updateByPrimaryKey(PowerRole record);
}