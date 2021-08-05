package com.group.special_work_exam.wallet.dao;

import com.group.special_work_exam.wallet.bean.CashOut;

public interface CashOutMapper {
    int deleteByPrimaryKey(Integer cashoutid);

    int insert(CashOut record);

    int insertSelective(CashOut record);

    CashOut selectByPrimaryKey(Integer cashoutid);

    int updateByPrimaryKeySelective(CashOut record);

    int updateByPrimaryKey(CashOut record);
}