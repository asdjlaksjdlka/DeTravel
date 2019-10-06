package com.qf.detravel.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "comment对象",description = "评论的内容")
public class Notification {
    private Integer nId;
    @ApiModelProperty(value = "评论某个用户的id",name = "toUser",example = "1")
    private Integer toUser;
    @ApiModelProperty(value = "评论来自哪个用户的id",name = "fromUser",example = "2")
    private Integer fromUser;
    @ApiModelProperty(value = "消息内容",name = "nContent",example = "评论内容")
    private String nContent;

    private String nUrl;
    @ApiModelProperty(value = "通知的时间",name = "nTime",example = "2019-10-6")
    private Date nTime;
    @ApiModelProperty(value = "通知的类型",name = "nType",example = "1、点赞；2、关注；3、评论")
    private String nType;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "nId=" + nId +
                ", toUser=" + toUser +
                ", fromUser=" + fromUser +
                ", nContent='" + nContent + '\'' +
                ", nUrl='" + nUrl + '\'' +
                ", nTime=" + nTime +
                ", nType='" + nType + '\'' +
                '}';
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getToUser() {
        return toUser;
    }

    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }

    public Integer getFromUser() {
        return fromUser;
    }

    public void setFromUser(Integer fromUser) {
        this.fromUser = fromUser;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public String getnUrl() {
        return nUrl;
    }

    public void setnUrl(String nUrl) {
        this.nUrl = nUrl;
    }

    public Date getnTime() {
        return nTime;
    }

    public void setnTime(Date nTime) {
        this.nTime = nTime;
    }

    public String getnType() {
        return nType;
    }

    public void setnType(String nType) {
        this.nType = nType;
    }
}
