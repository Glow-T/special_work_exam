package com.group.special_work_exam.simrecord.controller;


import com.group.special_work_exam.simrecord.bean.WongCollectRecord;
import com.group.special_work_exam.simrecord.dao.WongCollectRecordMapper;
import com.group.special_work_exam.sys.bean.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;


@RestController
@Api(tags = "插入错误题目")
public class InsertErrCollerctImpl {

    @Autowired
    WongCollectRecordMapper wongCollectRecordMapper;


    @ApiOperation(value = "插入错误题目")
    @GetMapping("insertErrCollerct")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "userId" ,value = "用户id", paramType = "Integer"),
                    @ApiImplicitParam(name = "type" ,value = "类型id",paramType = "Integer"),
                    @ApiImplicitParam(name = "questionId" ,value = "题目id",paramType = "Integer")
            }
    )
    public Object inserterrColler(Integer userId ,Integer type,Integer questionId ){
        WongCollectRecord wongCollectRecord=new WongCollectRecord();
        wongCollectRecord.setCollectQuestionid(questionId);
        wongCollectRecord.setCollectType(type);
        wongCollectRecord.setCollectUserid(userId);
        wongCollectRecord.setCollectRecodeId(UUID.randomUUID().toString());
        wongCollectRecord.setCollectTime(new Date());
        ResultBean resultBean=new ResultBean();
        wongCollectRecordMapper.insertSelective(wongCollectRecord);
        resultBean.setObj(wongCollectRecord);
        return resultBean;
    }
}
