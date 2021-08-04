package com.group.special_work_exam.controller;


import com.group.special_work_exam.bean.LunBo;
import com.group.special_work_exam.bean.ResultBean;
import com.group.special_work_exam.bean.Unit;
import com.group.special_work_exam.dao.LunBoMapper;
import com.group.special_work_exam.dao.UnitMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unit")
@Api(tags = "试题单元管理")
public class UnitControllerImpl {

    @Autowired
    UnitMapper mapper;

    @GetMapping("/findbyprovincetypeid")
    @ApiOperation(value = "通过类型id查询单元，可通过单元中的单元id查询题目")
    @ApiImplicitParam(name = "provinceTypeId",value = "要查询的省份（题目类型）编号")

    public Object findByProvinceTypeId(Integer provinceTypeId){

        List<Unit> unit = mapper.findByProvinceTypeId(provinceTypeId);
        ResultBean resultBean = null;
        if(unit!=null){
            resultBean = new ResultBean();
            resultBean.setObj(unit);
        }else{
            resultBean = new ResultBean(ResultBean.CODE.FAIL);
        }
        return resultBean;

    }
}
