package com.group.special_work_exam.wallet.dao;

import com.group.special_work_exam.wallet.bean.InvestMoneyRecord;

public interface InvestMoneyRecordMapper {
    int deleteByPrimaryKey(Integer investId);

    int insert(InvestMoneyRecord record);

    int insertSelective(InvestMoneyRecord record);

    InvestMoneyRecord selectByPrimaryKey(Integer investId);

    int updateByPrimaryKeySelective(InvestMoneyRecord record);

    int updateByPrimaryKey(InvestMoneyRecord record);
}