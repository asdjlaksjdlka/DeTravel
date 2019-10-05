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
    private String dCountry;
    private Date pId;
    private Integer uId;

    private List<Comment> comment;

    @Override
    public String toString() {
        return "Dynamic{" +
                "dId=" + dId +
                ", dDesc='" + dDesc + '\'' +
                ", dCountry='" + dCountry + '\'' +
                ", pId=" + pId +
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

    public String getdCountry() {
        return dCountry;
    }

    public void setdCountry(String dCountry) {
        this.dCountry = dCountry;
    }

    public Date getpId() {
        return pId;
    }

    public void setpId(Date pId) {
        this.pId = pId;
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
