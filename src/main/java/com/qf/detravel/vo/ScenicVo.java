package com.qf.detravel.vo;

import com.qf.detravel.entity.Photo;

import java.util.List;

public class ScenicVo {
    private Integer sId;
    private String sName;
    private String sRegion;
    private String sCountry;
    private String sHistory;
    private String sDesc;
    private Integer vId;
    private List<Photo> photos;

    public ScenicVo() {
    }

    public ScenicVo(Integer sId, String sName, String sRegion, String sCountry, String sHistory, String sDesc, Integer vId, List<Photo> photos) {
        this.sId = sId;
        this.sName = sName;
        this.sRegion = sRegion;
        this.sCountry = sCountry;
        this.sHistory = sHistory;
        this.sDesc = sDesc;
        this.vId = vId;
        this.photos = photos;
    }

    public Integer getsId() {
        return this.sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return this.sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsRegion() {
        return this.sRegion;
    }

    public void setsRegion(String sRegion) {
        this.sRegion = sRegion;
    }

    public String getsCountry() {
        return this.sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getsHistory() {
        return this.sHistory;
    }

    public void setsHistory(String sHistory) {
        this.sHistory = sHistory;
    }

    public String getsDesc() {
        return this.sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public Integer getvId() {
        return this.vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
