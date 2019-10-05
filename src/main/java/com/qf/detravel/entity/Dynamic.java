package com.qf.detravel.entity;


import java.io.Serializable;

/**
 * @author Money
 * Dynamic实体类
 */
public class Dynamic implements Serializable {
    private Integer dId;
    private String dCountry;
    private Integer pId;
    private Integer uId;
    private String dDesc;
    private Photo photo;

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdCountry() {
        return dCountry;
    }

    public void setdCountry(String dCountry) {
        this.dCountry = dCountry;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "dId=" + dId +
                ", dCountry='" + dCountry + '\'' +
                ", pId=" + pId +
                ", uId=" + uId +
                ", photo=" + photo +
                '}';
    }
}
