package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.WalletWater;

public interface WalletWaterMapper {
    int deleteByPrimaryKey(String walletWaterId);

    int insert(WalletWater record);

    int insertSelective(WalletWater record);

    WalletWater selectByPrimaryKey(String walletWaterId);

    int updateByPrimaryKeySelective(WalletWater record);

    int updateByPrimaryKey(WalletWater record);
}