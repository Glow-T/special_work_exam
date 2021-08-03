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

import java.util.List;

@RestController
@RequestMapping("/praticerecord")
@Api(tags = "题目练习历史管理")
public class PracticeRecordControllerImpl {

    @Autowired
    PracticeRecordMapper mapper;

    @GetMapping("/finduserhistory")
    @ApiOperation(value = "通过用户id+单元id查询历史练习题目")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId" , value ="用户Id"),
    })


    public Object findUserHistory(Integer userId){

        List<PracticeRecord> list = mapper.findByUserId(userId);

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
    @ApiOperation(value = "通过用户id+单元id查询历史练习题目数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId" , value ="用户Id"),
    })


    public Object findUserHistoryCount(Integer userId){

        Integer count = mapper.findCountByUserId(userId);

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
