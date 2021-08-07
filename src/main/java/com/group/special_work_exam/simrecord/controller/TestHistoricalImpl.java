package com.group.special_work_exam.simrecord.controller;


import com.group.special_work_exam.examination.bean.ExamQuestion;
import com.group.special_work_exam.examination.dao.ExamQuestionMapper;
import com.group.special_work_exam.simrecord.bean.SimulateRecordDetails;
import com.group.special_work_exam.simrecord.dao.SimulateRecordDetailsMapper;
import com.group.special_work_exam.sys.bean.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(tags = "查询错题")
@RestController
public class TestHistoricalImpl {

    @Autowired
    ExamQuestionMapper examQuestionMapper;

    @Autowired
    SimulateRecordDetailsMapper simulateRecordDetailsMapper;

    @GetMapping("err")
    @ApiOperation(value = "查询错误题目")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name ="provinceTypeId",value = "类型id"),
                    @ApiImplicitParam(name = "userId",value = "用户id")
            }
    )
    public ResultBean selectErr(Integer provinceTypeId,Integer userId){
        Map map = new HashMap();
        map.put("provinceTypeId",provinceTypeId);
        map.put("userId",userId);
        ResultBean resultBean=new ResultBean();
        List<ExamQuestion> byProvinceTypeId = examQuestionMapper.findByProvinceTypeId(map);

        List<SimulateRecordDetails> simulateRecordDetails = simulateRecordDetailsMapper.selelctErr(userId);
        List<ExamQuestion> list=new ArrayList<>();
        for (int i = 0; i < byProvinceTypeId.size(); i++) {
                ExamQuestion examQuestion=byProvinceTypeId.get(i);
            for (SimulateRecordDetails s:simulateRecordDetails) {
               if (examQuestion.getId().intValue()==s.getQuestionid().intValue()){
                   list.add(examQuestion);
               }

            }
        }
        resultBean.setObj(list);
        return resultBean;

    }


}
