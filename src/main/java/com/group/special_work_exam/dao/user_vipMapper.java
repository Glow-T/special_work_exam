package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.user_vip;

public interface user_vipMapper {
    int deleteByPrimaryKey(Integer uservipId);

    int insert(user_vip record);

    int insertSelective(user_vip record);

    user_vip selectByPrimaryKey(Integer uservipId);

    int updateByPrimaryKeySelective(user_vip record);

    int updateByPrimaryKey(user_vip record);
}