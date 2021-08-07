package com.group.special_work_exam.uservip.dao;

import com.group.special_work_exam.uservip.bean.UserVip;

import java.util.Map;

public interface UserVipMapper {
    int deleteByPrimaryKey(Integer uservipId);

    int insert(UserVip record);

    int insertSelective(UserVip record);

    UserVip selectByPrimaryKey(Integer uservipId);

    int updateByPrimaryKeySelective(UserVip record);

    int updateByPrimaryKey(UserVip record);

    UserVip findVip(Map map);

    int updateByOpenId(Map map);
}