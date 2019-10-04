package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;

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

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public Integer getdId() {
        return this.dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdDesc() {
        return this.dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc;
    }

    public String getdPhoto() {
        return this.dPhoto;
    }

    public void setdPhoto(String dPhoto) {
        this.dPhoto = dPhoto;
    }

    public Integer getuId() {
        return this.uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
