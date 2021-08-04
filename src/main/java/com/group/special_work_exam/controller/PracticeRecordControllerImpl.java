package com.group.special_work_exam.controller;


import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.PracticeRecord;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.dao.ExamQuestionMapper;
import com.group.special_work_exam.dao.PracticeRecordMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/praticerecord")
@Api(tags = "题目练习历史管理")
public class PracticeRecordControllerImpl {

    @Autowired
    PracticeRecordMapper mapper;

    @GetMapping("/finduserhistory")
    @ApiOperation(value = "通过用户id+类型id查询历史练习题目")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId" , value ="用户Id"),
            @ApiImplicitParam(name = "provinceTypeId" , value ="类型Id"),
    })


    public Object findUserHistory(Integer userId,Integer provinceTypeId){

        Map map = new HashMap();
        map.put("userId",userId);
        map.put("provinceTypeId",provinceTypeId);

        List<PracticeRecord> list = mapper.findHistory(userId,provinceTypeId);

        ResultBean resultBean = null;

        if(list!=null){
            resultBean = new ResultBean();
            resultBean.setObj(list);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }

        return resultBean;

    }


    @GetMapping("/finduserhistorycount")
    @ApiOperation(value = "通过用户id+类型id查询历史练习题目数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId" , value ="用户Id"),
            @ApiImplicitParam(name = "provinceTypeId" , value ="类型Id"),
    })


    public Object findUserHistoryCount(Integer userId,Integer provinceTypeId){
        Map map = new HashMap();
        map.put("userId",userId);
        map.put("provinceTypeId",provinceTypeId);

        Integer count = mapper.findCount(map);

        ResultBean resultBean = null;

        if(count!=null){
            resultBean = new ResultBean();
            resultBean.setObj(count);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }

        return resultBean;

    }


}
