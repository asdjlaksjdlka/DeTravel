package com.qf.detravel.entity;

import java.io.Serializable;

/**
 * @author Money
 * Photo实体类
 */
public class Photo implements Serializable {

    private Integer pId;
    private String pUrl;
    private Integer sId;

    public Photo() {
    }

    public Photo(Integer pId, String pUrl, Integer sId) {
        this.pId = pId;
        this.pUrl = pUrl;
        this.sId = sId;
    }

    public Integer getpId() {
        return this.pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpUrl() {
        return this.pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public Integer getsId() {
        return this.sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
}
