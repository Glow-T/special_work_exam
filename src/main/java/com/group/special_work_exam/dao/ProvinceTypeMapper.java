package com.group.special_work_exam.dao;

import com.group.special_work_exam.bean.ProvinceType;
import com.group.special_work_exam.bean.ResultBean;


import java.util.List;


public interface ProvinceTypeMapper {
    int deleteByPrimaryKey(Integer provinceTypeId);

    int insert(ProvinceType record);

    int insertSelective(ProvinceType record);

    ProvinceType selectByPrimaryKey(Integer provinceTypeId);

    int updateByPrimaryKeySelective(ProvinceType record);

    int updateByPrimaryKey(ProvinceType record);

    List<ProvinceType> selectcity();

    List<ProvinceType>selectTest();
    List<ProvinceType> selectTestSpecial();
    List<ProvinceType> selectThree();

    List<ProvinceType> selectAnimal();
    List<ProvinceType> selectEight();
}