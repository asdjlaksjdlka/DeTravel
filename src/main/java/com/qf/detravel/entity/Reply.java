package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable {
    private Integer rId;
    private Integer commentId;
    private Integer replyId;
    private String replyType;
    private Integer fromUid;
    private String toUid;
    private String content;
    private Date replyTime;

    @Override
    public String toString() {
        return "Reply{" +
                "rId=" + rId +
                ", commentId=" + commentId +
                ", replyId=" + replyId +
                ", replyType='" + replyType + '\'' +
                ", fromUid=" + fromUid +
                ", toUid='" + toUid + '\'' +
                ", content='" + content + '\'' +
                ", replyTime=" + replyTime +
                '}';
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public String getToUid() {
        return toUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
