package com.group.special_work_exam.wallet.dao;

import com.group.special_work_exam.wallet.bean.GoodsVipSaleRecord;

public interface GoodsVipSaleRecordMapper {
    int deleteByPrimaryKey(Integer saleId);

    int insert(GoodsVipSaleRecord record);

    int insertSelective(GoodsVipSaleRecord record);

    GoodsVipSaleRecord selectByPrimaryKey(Integer saleId);

    int updateByPrimaryKeySelective(GoodsVipSaleRecord record);

    int updateByPrimaryKey(GoodsVipSaleRecord record);
}