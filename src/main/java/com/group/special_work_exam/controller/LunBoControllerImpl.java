package com.group.special_work_exam.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group.special_work_exam.bean.LunBo;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.dao.LunBoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lunbo")
@Api(tags = "轮播图管理")
public class LunBoControllerImpl {

    @Autowired
    LunBoMapper mapper;

    @GetMapping("/")
    @ApiOperation(value = "获取轮播图信息")

    public Object list(){

        List<LunBo> lunbo = mapper.selectAll();
        ResultBean resultBean=null;
        if(lunbo!=null){
            resultBean = new ResultBean();
            resultBean.setObj(lunbo);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;



    }
}
