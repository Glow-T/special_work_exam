package com.group.special_work_exam.bean;

import java.io.Serializable;
import java.util.Date;

public class ShareRecord implements Serializable {
    private String shareRecordId;

    private Integer shareHostUserid;

    private Integer shareFriendUserid;

    private Date shareTime;

    private static final long serialVersionUID = 1L;

    public String getShareRecordId() {
        return shareRecordId;
    }

    public void setShareRecordId(String shareRecordId) {
        this.shareRecordId = shareRecordId == null ? null : shareRecordId.trim();
    }

    public Integer getShareHostUserid() {
        return shareHostUserid;
    }

    public void setShareHostUserid(Integer shareHostUserid) {
        this.shareHostUserid = shareHostUserid;
    }

    public Integer getShareFriendUserid() {
        return shareFriendUserid;
    }

    public void setShareFriendUserid(Integer shareFriendUserid) {
        this.shareFriendUserid = shareFriendUserid;
    }

    public Date getShareTime() {
        return shareTime;
    }

    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }
}