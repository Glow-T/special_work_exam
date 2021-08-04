package com.group.special_work_exam.bean;

public class ResultBean {
    private Integer code;
    private String msg;
    private Object obj;

    public enum CODE{
        SUCCESS,FAIL,EXCEPTION
    }


    public ResultBean(CODE cx){
        if(cx==CODE.SUCCESS){
            this.code=100;
            this.msg="OK";
        }else if(cx==CODE.FAIL){
            this.code=200;
            this.msg="Fail";
        }else if(cx==CODE.EXCEPTION){
            this.code=300;
            this.msg="Exception";
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
