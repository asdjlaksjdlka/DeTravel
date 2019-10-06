package com.qf.detravel.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
@ApiModel(value = "Reply对象，评论的回复内容",description = "回复评论的内容")
public class Reply implements Serializable {
    @ApiModelProperty(value = "回复评论的id,数据库自增，不需要传",name = "rId")
    private Integer rId;
    @ApiModelProperty(value = "该条回复对应的“朋友圈”的id",name = "dId",example = "1")
    private Integer dId;
    @ApiModelProperty(value = "该条评回复对应的“评论”的id",name = "Id",example = "1")
    private Integer cId;
    @ApiModelProperty(value = "回复来自谁Uid",name = "fromUid",example = "用户id")
    private Integer fromUid;
    @ApiModelProperty(value = "该条回复对用的评论id",name = "toUid")
    private Integer toUid;
    @ApiModelProperty(value = "回复的内容,需要前端获取",name = "content",example = "针对某条评论的回复")
    private String content;
    @ApiModelProperty(value = "回复时间，后端自动生成",name = "replyTime",example = "2019")
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
