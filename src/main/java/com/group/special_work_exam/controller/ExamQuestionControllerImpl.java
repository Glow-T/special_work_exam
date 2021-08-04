package com.group.special_work_exam.controller;


import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.bean.Unit;
import com.group.special_work_exam.dao.ExamQuestionMapper;
import com.group.special_work_exam.dao.UnitMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/examquestion")
@Api(tags = "试题管理")
public class ExamQuestionControllerImpl {

    @Autowired
    ExamQuestionMapper mapper;
    @Autowired
    UnitMapper  unitMapper;


    @GetMapping("/findbyunitid")
    @ApiOperation(value = "通过类型id查询题目")
    @ApiImplicitParam(name = "provinceTypeId" , value ="类型id")


    public Object findByProvinceTypeId(Integer provinceTypeId){

        List<ExamQuestion> questionList =mapper.findByProvinceTypeId(provinceTypeId);
        ResultBean resultBean = null;

        if(questionList!=null){
            resultBean = new ResultBean();
            resultBean.setObj(questionList);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }

        return resultBean;

    }


    @GetMapping("/findcountbyunitid")
    @ApiOperation(value = "通过类型类型id查询题目数量")
    @ApiImplicitParam(name = "provinceTypeId" , value ="类型id")


    public Object findCountByProvinceTypeId(Integer provinceTypeId){
        Integer count = mapper.findCount(provinceTypeId);
        ResultBean resultBean = null;
        if(count!=null){
            resultBean = new ResultBean();
            resultBean.setObj(count);
        }else{
            resultBean=new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;
    }

}
