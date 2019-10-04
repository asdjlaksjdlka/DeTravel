package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer cId;
    private Integer topicId;
    private String topicType;
    private String content;
    private Integer fromUid;
    private Date commentTime;

    @Override
    public String toString() {
        return "Comment{" +
                "cId=" + cId +
                ", topicId=" + topicId +
                ", topicType='" + topicType + '\'' +
                ", content='" + content + '\'' +
                ", fromUid=" + fromUid +
                ", commentTime=" + commentTime +
                '}';
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicType() {
        return topicType;
    }

    public void setTopicType(String topicType) {
        this.topicType = topicType;
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
}
