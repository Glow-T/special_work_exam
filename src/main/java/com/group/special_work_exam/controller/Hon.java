package com.group.special_work_exam.controller;

import com.group.special_work_exam.bean.ExamQuestion;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.dao.ExamQuestionMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "三类人员考试")
public class Hon {

    @Autowired
    ExamQuestionMapper examQuestionMapper;

    @GetMapping("hona")
    @ApiOperation(value = "安全员A")
    public ResultBean selectHonA(){
        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
        List<ExamQuestion> examQuestions = examQuestionMapper.selectHonA();
        resultBean.setObj(examQuestions);
        return resultBean;
    }
    @GetMapping("honacount")
    @ApiOperation(value = "安全员A题目数量")
    public ResultBean selectHonAcount(){
        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
        int acount = examQuestionMapper.selectHonAcount();

        resultBean.setObj(acount);
        return resultBean;
    }
}
