package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.GoodsVip;

public interface GoodsVipMapper {
    int deleteByPrimaryKey(Integer goodsvipId);

    int insert(GoodsVip record);

    int insertSelective(GoodsVip record);

    GoodsVip selectByPrimaryKey(Integer goodsvipId);

    int updateByPrimaryKeySelective(GoodsVip record);

    int updateByPrimaryKey(GoodsVip record);
}