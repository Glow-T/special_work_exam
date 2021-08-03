package com.group.special_work_exam.controller;


import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.dao.ExamQuestionMapper;
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
@RequestMapping("/examquestion")
@Api(tags = "试题管理")
public class ExamQuestionControllerImpl {

    @Autowired
    ExamQuestionMapper mapper;

    @GetMapping("/findbyunitid")
    @ApiOperation(value = "通过类型单元id查询题目")
    @ApiImplicitParam(name = "unitId" , value ="单元Id，可同时传入多个值")

    public Object findByUnitId(Integer ...unitId){
        List<ExamQuestion> list = null;
        for (Integer i: unitId) {
            List<ExamQuestion> questionList =mapper.findByUnitId(i);
            if(list==null){
                list=questionList;
            }else{
                list.addAll(questionList);
            }
        }

        ResultBean resultBean = null;

        if(list!=null){
            resultBean = new ResultBean();
            resultBean.setObj(list);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }

        return resultBean;

    }


    @GetMapping("/findcountbyunitid")
    @ApiOperation(value = "通过类型单元id查询题目数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "unitId" , value ="单元Id，可同时传入多个值")
    })

    public Object findCountByUnitId(Integer ...unitId){

        Integer count = 0;
        for (Integer i: unitId) {
            count += mapper.findCountByUnitId(i);
        }
        ResultBean resultBean = null;
        resultBean = new ResultBean();
        resultBean.setObj(count);
        return resultBean;

    }
}
