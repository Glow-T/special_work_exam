package com.group.special_work_exam.uservip.dao;

import com.group.special_work_exam.uservip.bean.ShareRecord;

public interface ShareRecordMapper {
    int deleteByPrimaryKey(String shareRecordId);

    int insert(ShareRecord record);

    int insertSelective(ShareRecord record);

    ShareRecord selectByPrimaryKey(String shareRecordId);

    int updateByPrimaryKeySelective(ShareRecord record);

    int updateByPrimaryKey(ShareRecord record);
}