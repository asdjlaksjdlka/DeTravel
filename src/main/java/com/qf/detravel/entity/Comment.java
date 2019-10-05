package com.qf.detravel.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel(value = "comment对象",description = "评论的内容")
public class Comment implements Serializable {
    @ApiModelProperty(value = "单条评论的id,数据库自增，不需要传",name = "cId")
    private Integer cId;
    @ApiModelProperty(value = "该条评论对应的“朋友圈”的id",name = "dId",example = "1")
    private Integer dId;
    @ApiModelProperty(value = "评论的内容,需要前端获取",name = "content",example = "针对某条状态的评论")
    private String c_content;
    @ApiModelProperty(value = "评论来自谁Uid",name = "fromUid",example = "用户id")
    private Integer fromUid;
    @ApiModelProperty(value = "评论时间，后端自动生成",name = "commentTime",example = "2019")
    private Date commentTime;
    @ApiModelProperty(value = "评论对应的回复实体类",name = "reply")
    private List<Reply> reply;

    @Override
    public String toString() {
        return "Comment{" +
                "cId=" + cId +
                ", dId=" + dId +
                ", content='" + c_content + '\'' +
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

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
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
