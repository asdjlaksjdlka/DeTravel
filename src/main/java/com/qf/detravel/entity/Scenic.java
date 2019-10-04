package com.qf.detravel.entity;

import java.io.Serializable;
/**
 * @author Money
 * Scenic实体类
 */
public class Scenic implements Serializable {
    private Integer sId;
    private String sName;
    private String sRegion;
    private String sCountry;
    private String sHistory;
    private String sDesc;
    private Integer vId;
    private String pUrl;

    public Scenic() {
    }

    public Scenic(Integer sId, String sName, String sRegion, String sCountry, String sHistory, String sDesc, Integer vId, String pUrl) {
        this.sId = sId;
        this.sName = sName;
        this.sRegion = sRegion;
        this.sCountry = sCountry;
        this.sHistory = sHistory;
        this.sDesc = sDesc;
        this.vId = vId;
        this.pUrl = pUrl;
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

    public String getpUrl() {
        return this.pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }
}
