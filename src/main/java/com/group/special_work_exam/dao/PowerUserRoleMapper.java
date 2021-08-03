package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.PowerUserRole;

public interface PowerUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PowerUserRole record);

    int insertSelective(PowerUserRole record);

    PowerUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PowerUserRole record);

    int updateByPrimaryKey(PowerUserRole record);
}