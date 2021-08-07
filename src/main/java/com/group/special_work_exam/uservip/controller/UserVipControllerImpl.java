package com.group.special_work_exam.uservip.controller;

import com.group.special_work_exam.sys.bean.ResultBean;
import com.group.special_work_exam.uservip.bean.User;
import com.group.special_work_exam.uservip.bean.UserVip;
import com.group.special_work_exam.uservip.dao.UserMapper;
import com.group.special_work_exam.uservip.dao.UserVipMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vip")
@Api(tags = "Vip管理")
public class UserVipControllerImpl {
    @Autowired
    UserVipMapper mapper;
    @Autowired
    UserMapper userMapper;
    @GetMapping("/findvip")
    @ApiOperation(value = "查询用户vip状态信息，根据系统时间更新vip有效标志位")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openid" , value ="微信登录openid"),
            @ApiImplicitParam(name = "provinceTypeId" , value ="题目类型id")
    })
    public Object findVipInfo(String openid,Integer provinceTypeId){
        Map map = new HashMap();
        map.put("openid",openid);
        map.put("provincetypeid",provinceTypeId);
        ResultBean resultBean = null;
        UserVip userVip=mapper.findVip(map);
        if(userVip!=null){
            Date nowDate = new Date();
            Date endDate = userVip.getUservipEndtime();
            if(endDate.before(nowDate)){
                userVip.setUservipState(0);
                mapper.insertSelective(userVip);
            }
            resultBean = new ResultBean();
            resultBean.setObj(userVip);
        }else{
            resultBean=new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;
    }
    @GetMapping("/updatevip")
    @Transactional
    @ApiOperation(value = "用户充值，更新用户VIP时长")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openid" , value ="微信登录openid"),
            @ApiImplicitParam(name = "provinceTypeId" , value ="题目类型id")
    })
    public Object updateVipInfo(String openid,Integer provinceTypeId,Integer month){
        ResultBean resultBean = null;
        Map map = new HashMap();
        map.put("openid",openid);
        map.put("provincetypeid",provinceTypeId);
        UserVip userVip=mapper.findVip(map);
        if(userVip!=null&&userVip.getUservipState()==1){
            Date endDate = userVip.getUservipEndtime();
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(endDate);
            rightNow.add(Calendar.DATE, month*30);
            endDate = rightNow.getTime();
            userVip.setUservipEndtime(endDate);
            userVip.setUservipModifytime(new Date());
            map.put("userVip",userVip);
            int result = mapper.updateByOpenId(map);
            resultBean = new ResultBean();
            resultBean.setObj(result);
            resultBean.setObj(userVip);
        }else if(userVip!=null&&userVip.getUservipState()==0){
            Date nowTime = new Date();
            userVip.setUservipBegintime(nowTime);
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(nowTime);
            rightNow.add(Calendar.DATE, month*30);
            nowTime = rightNow.getTime();
            userVip.setUservipEndtime(nowTime);
            userVip.setUservipState(1);
            userVip.setUservipModifytime(new Date());
            map.put("userVip",userVip);
            int result = mapper.updateByOpenId(map);
            resultBean = new ResultBean();
            resultBean.setObj(result);
            resultBean.setObj(userVip);
        }else if(userVip==null){
            userVip=new UserVip();
            Date nowTime = new Date();
            userVip.setUservipBegintime(nowTime);
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(nowTime);
            rightNow.add(Calendar.DATE, month*30);
            nowTime = rightNow.getTime();
            userVip.setUservipEndtime(nowTime);
            userVip.setUservipState(1);
            userVip.setUservipTypeid(provinceTypeId);
            userVip.setUservipCreatetime(new Date());
            User user =userMapper.findUser(openid);
            Long userid = user.getId();
            userVip.setUserid(userid.intValue());
            mapper.insertSelective(userVip);
            resultBean = new ResultBean();
            resultBean.setObj(userVip);
        }
        return resultBean;
    }
}
