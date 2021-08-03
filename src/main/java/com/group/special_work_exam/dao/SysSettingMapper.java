package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.SysSetting;

public interface SysSettingMapper {
    int deleteByPrimaryKey(Integer settingId);

    int insert(SysSetting record);

    int insertSelective(SysSetting record);

    SysSetting selectByPrimaryKey(Integer settingId);

    int updateByPrimaryKeySelective(SysSetting record);

    int updateByPrimaryKey(SysSetting record);
}