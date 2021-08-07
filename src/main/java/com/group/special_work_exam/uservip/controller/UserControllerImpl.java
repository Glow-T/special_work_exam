package com.group.special_work_exam.uservip.controller;


import com.group.special_work_exam.sys.bean.ResultBean;
import com.group.special_work_exam.uservip.bean.User;
import com.group.special_work_exam.uservip.dao.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserControllerImpl {
    @Autowired
    UserMapper mapper;
    @GetMapping("finduser")
    @ApiOperation(value = "通过openid查询用户信息,包括用户所有题型下的vip信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId" , value ="微信登录openid")
    })
    public Object finduser(String openId){
        ResultBean resultBean=null;
        User user = mapper.findUser(openId);
        if (user!=null){
            resultBean=new ResultBean();
            resultBean.setObj(user);
        }else{
            resultBean=new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;
    }
}
