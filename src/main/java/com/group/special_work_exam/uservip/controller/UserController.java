package com.group.special_work_exam.uservip.controller;

import com.group.special_work_exam.uservip.bean.User;
import com.group.special_work_exam.uservip.dao.UserMapper;
import com.group.special_work_exam.utils.RedisUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Api
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private HttpServletRequest request;

    @GetMapping("redis/save")
    public Object saveRedisUser(){
        List<User> users = userMapper.selectAll();
//        for (User u :users
//             ) {
//            redisUtils.setValue(u.getPhone(),u);
//        }
        redisUtils.setUsers(users);
        return "ok";

    }
    @PostMapping("login")
    public Object login(String phone,String password){
        Object value = redisUtils.getValue(phone);
        if (value==null){
            return "no user";

        }else {
            User user=(User) value;
            if (user.getPassword().equals(password)){
                request.setAttribute("user",user);
                return "登录成功";
            }
            else {
                return "密码错误";
            }
        }

    }


}
