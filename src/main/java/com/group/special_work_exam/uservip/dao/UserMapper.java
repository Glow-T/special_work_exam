package com.group.special_work_exam.uservip.dao;

import com.group.special_work_exam.uservip.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUser(String openid);
}