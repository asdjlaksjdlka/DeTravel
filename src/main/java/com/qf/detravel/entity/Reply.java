package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable {
    private Integer rId;
    private Integer dId;
    private Integer cId;
    private Integer fromUid;
    private Integer toUid;
    private String content;
    private Date replyTime;

    @Override
    public String toString() {
        return "Reply{" +
                "rId=" + rId +
                ", dId=" + dId +
                ", cId=" + cId +
                ", fromUid=" + fromUid +
                ", toUid=" + toUid +
                ", content='" + content + '\'' +
                ", replyTime=" + replyTime +
                '}';
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}
