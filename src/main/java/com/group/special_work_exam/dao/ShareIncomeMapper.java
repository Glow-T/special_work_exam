package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ShareIncome;

public interface ShareIncomeMapper {
    int deleteByPrimaryKey(String shareIncomeId);

    int insert(ShareIncome record);

    int insertSelective(ShareIncome record);

    ShareIncome selectByPrimaryKey(String shareIncomeId);

    int updateByPrimaryKeySelective(ShareIncome record);

    int updateByPrimaryKey(ShareIncome record);
}