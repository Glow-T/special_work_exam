package com.group.special_work_exam.simrecord.dao;

import com.group.special_work_exam.simrecord.bean.WongCollectRecord;

public interface WongCollectRecordMapper {
    int deleteByPrimaryKey(String collectRecodeId);

    int insert(WongCollectRecord record);

    int insertSelective(WongCollectRecord record);

    WongCollectRecord selectByPrimaryKey(String collectRecodeId);

    int updateByPrimaryKeySelective(WongCollectRecord record);

    int updateByPrimaryKey(WongCollectRecord record);
}