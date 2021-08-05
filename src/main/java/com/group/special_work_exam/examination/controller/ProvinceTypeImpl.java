package com.group.special_work_exam.examination.controller;

import com.group.special_work_exam.examination.bean.ProvinceType;
import com.group.special_work_exam.sys.bean.ResultBean;
import com.group.special_work_exam.examination.dao.ProvinceTypeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "查询所有江苏的")
public class ProvinceTypeImpl {

    @Autowired
    ProvinceTypeMapper provinceTypeMapper;

    @GetMapping("province")
    @ApiOperation("查询所有的")
    public ResultBean getprovince(){
        List<ProvinceType> temp =new ArrayList<>();
        List<ProvinceType> selectall = provinceTypeMapper.selectall();
        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
        for (int i=0;i<selectall.size();i++){
            ProvinceType type=selectall.get(i);
            for (ProvinceType t: selectall) {
                if (type.getProvinceTypeId().intValue()==t.getPid().intValue())
                {
                     type.getList().add(t);
                     temp.add(t);
                }
            }
        }
        selectall.removeAll(temp);
        resultBean.setObj(selectall);
        return resultBean;

    }


//    @GetMapping("/city")
//    @ApiOperation(value = "查询所有城市")
//    public ResultBean city(){
//        List<ProvinceType> selectcity = provinceTypeMapper.selectcity();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectcity);
//        return resultBean;
//    }
//
//    @GetMapping("/test")
//    @ApiOperation(value = "查询所有江苏考试")
//    public ResultBean test(){
//        List<ProvinceType> selectTest = provinceTypeMapper.selectTest();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectTest);
//        return resultBean;
//    }
//    @GetMapping("/special")
//    @ApiOperation(value = "查询所有特种作业考试")
//    public ResultBean testSpecial(){
//        List<ProvinceType> selectTestSpecial = provinceTypeMapper.selectTestSpecial();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectTestSpecial);
//        return resultBean;
//    }
//    @GetMapping("/three")
//    @ApiOperation(value = "查询所有三类人员考试")
//    public ResultBean testThree(){
//        List<ProvinceType> selectThree = provinceTypeMapper.selectThree();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectThree);
//        return resultBean;
//    }
//    @GetMapping("/animal")
//    @ApiOperation(value = "查询所有动物技能实验考试")
//    public ResultBean selectAnimal(){
//        List<ProvinceType> selectAnimal = provinceTypeMapper.selectAnimal();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectAnimal);
//        return resultBean;
//    }
//    @GetMapping("/eight")
//    @ApiOperation(value = "查询所有八大员验考试")
//    public ResultBean selectEight(){
//        List<ProvinceType> selectEight = provinceTypeMapper.selectEight();
//        ResultBean resultBean=new ResultBean(ResultBean.CODE.SUCCESS);
//        resultBean.setObj(selectEight);
//        return resultBean;
//    }
//    @GetMapping("hello")
//    public String Test(){
//        return "hello";
//    }


}
