package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ProvinceType;

public interface ProvinceTypeMapper {
    int deleteByPrimaryKey(Integer provinceTypeId);

    int insert(ProvinceType record);

    int insertSelective(ProvinceType record);

    ProvinceType selectByPrimaryKey(Integer provinceTypeId);

    int updateByPrimaryKeySelective(ProvinceType record);

    int updateByPrimaryKey(ProvinceType record);
}