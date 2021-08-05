package com.group.special_work_exam.sys.bean;

import java.io.Serializable;

public class LunBo implements Serializable {
    private Integer id;

    private String imageurl;

    private String imagedesc;

    private String prepareone;

    private String preparetwo;

    private String preparethree;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getImagedesc() {
        return imagedesc;
    }

    public void setImagedesc(String imagedesc) {
        this.imagedesc = imagedesc == null ? null : imagedesc.trim();
    }

    public String getPrepareone() {
        return prepareone;
    }

    public void setPrepareone(String prepareone) {
        this.prepareone = prepareone == null ? null : prepareone.trim();
    }

    public String getPreparetwo() {
        return preparetwo;
    }

    public void setPreparetwo(String preparetwo) {
        this.preparetwo = preparetwo == null ? null : preparetwo.trim();
    }

    public String getPreparethree() {
        return preparethree;
    }

    public void setPreparethree(String preparethree) {
        this.preparethree = preparethree == null ? null : preparethree.trim();
    }
}