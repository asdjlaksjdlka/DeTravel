package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment implements Serializable {
    private Integer cId;
    private Integer dId;
    private String content;
    private Integer fromUid;
    private Date commentTime;

    private List<Reply> reply;

    @Override
    public String toString() {
        return "Comment{" +
                "cId=" + cId +
                ", dId=" + dId +
                ", content='" + content + '\'' +
                ", fromUid=" + fromUid +
                ", commentTime=" + commentTime +
                ", reply=" + reply +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }
}
