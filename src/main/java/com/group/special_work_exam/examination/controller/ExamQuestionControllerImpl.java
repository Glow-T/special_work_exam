package com.group.special_work_exam.examination.controller;

import com.group.special_work_exam.examination.bean.ExamQuestion;
import com.group.special_work_exam.sys.bean.ResultBean;
import com.group.special_work_exam.examination.dao.ExamQuestionMapper;
import com.group.special_work_exam.examination.dao.UnitMapper;
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
@RequestMapping("/examquestion")
@Api(tags = "试题管理")
public class ExamQuestionControllerImpl {

    @Autowired
    ExamQuestionMapper mapper;
    @Autowired
    UnitMapper  unitMapper;

    @GetMapping("/findquestion")
    @ApiOperation(value = "通过类型id,用户id查询题目，包含信息：题目、选项、练习记录、错题和收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "provinceTypeId" , value ="类型id"),
            @ApiImplicitParam(name = "userId" , value ="用户id")
    })
    public Object findByProvinceTypeId(Integer provinceTypeId,Integer userId){
        Map map = new HashMap();
        map.put("provinceTypeId",provinceTypeId);
        map.put("userId",userId);
        List<ExamQuestion> questionList =mapper.findByProvinceTypeId(map);
        ResultBean resultBean = null;
        if(questionList!=null){
            resultBean = new ResultBean();
            resultBean.setObj(questionList);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;
    }


    @GetMapping("/findcount")
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
