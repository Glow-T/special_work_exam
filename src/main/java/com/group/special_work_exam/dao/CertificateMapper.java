package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.Certificate;

public interface CertificateMapper {
    int deleteByPrimaryKey(Integer certificateId);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    Certificate selectByPrimaryKey(Integer certificateId);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKey(Certificate record);
}