package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class PowerLog implements Serializable {
    private Integer logId;

    private Date ctime;

    private Date endtime;

    private Float exctime;

    private String level;

    private String loggerName;

    private String fileName;

    private String host;

    private String thread;

    private String clasz;

    private String method;

    private String lineNumber;

    private String message;

    private String throwables;

    private String uri;

    private Long userId;

    private String params;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Float getExctime() {
        return exctime;
    }

    public void setExctime(Float exctime) {
        this.exctime = exctime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName == null ? null : loggerName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread == null ? null : thread.trim();
    }

    public String getClasz() {
        return clasz;
    }

    public void setClasz(String clasz) {
        this.clasz = clasz == null ? null : clasz.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber == null ? null : lineNumber.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getThrowables() {
        return throwables;
    }

    public void setThrowables(String throwables) {
        this.throwables = throwables == null ? null : throwables.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }
}