package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Money
 * Dynamic实体类
 */
public class Dynamic implements Serializable {
    private Integer dId;
    private String dDesc;
    private String dPhoto;
    private Date dTime;
    private Integer uId;

    private List<Comment> comment;

    @Override
    public String toString() {
        return "Dynamic{" +
                "dId=" + dId +
                ", dDesc='" + dDesc + '\'' +
                ", dPhoto='" + dPhoto + '\'' +
                ", dTime=" + dTime +
                ", uId=" + uId +
                ", comment=" + comment +
                '}';
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc;
    }

    public String getdPhoto() {
        return dPhoto;
    }

    public void setdPhoto(String dPhoto) {
        this.dPhoto = dPhoto;
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
