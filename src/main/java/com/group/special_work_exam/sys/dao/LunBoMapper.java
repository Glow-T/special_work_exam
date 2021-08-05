package com.group.special_work_exam.sys.dao;

import com.group.special_work_exam.sys.bean.LunBo;

import java.util.List;

public interface LunBoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LunBo record);

    int insertSelective(LunBo record);

    LunBo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LunBo record);

    int updateByPrimaryKey(LunBo record);

    List<LunBo> selectAll();
}