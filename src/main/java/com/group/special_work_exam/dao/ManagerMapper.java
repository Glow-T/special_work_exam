package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}