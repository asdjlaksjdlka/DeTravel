package com.qf.detravel.entity;

import java.io.Serializable;

/**
 * @author Money
 * Dynamic实体类
 */
public class Dynamic implements Serializable {
    private Integer dId;
    private String dDesc;
    private String dPhoto;
    private String dTime;
    private Integer uId;

    public Dynamic() {
    }

    public Dynamic(Integer dId, String dDesc, String dPhoto, String dTime, Integer uId) {
        this.dId = dId;
        this.dDesc = dDesc;
        this.dPhoto = dPhoto;
        this.dTime = dTime;
        this.uId = uId;
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

    public String getdTime() {
        return this.dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime;
    }

    public Integer getuId() {
        return this.uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}
