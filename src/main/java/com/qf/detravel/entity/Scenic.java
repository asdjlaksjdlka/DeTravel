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
    private Integer vId;
    private String pUrl;

    public Scenic() {
    }

    public Scenic(Integer sId, String sName, String sRegion, String sCountry, String sHistory, Integer vId, String pUrl) {
        this.sId = sId;
        this.sName = sName;
        this.sRegion = sRegion;
        this.sCountry = sCountry;
        this.sHistory = sHistory;
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
