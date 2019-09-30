package com.qf.detravel.entity;

import java.io.Serializable;

public class Scenic implements Serializable {
    private Integer Sid;
    private String Sname;
    private String Sregion;
    private String Scountry;
    private String Shistory;
    private Integer Vid;
    private String Purl;

    public Scenic() {
    }

    public Scenic(Integer sid, String sname, String sregion, String scountry, String shistory, Integer vid, String purl) {
        Sid = sid;
        Sname = sname;
        Sregion = sregion;
        Scountry = scountry;
        Shistory = shistory;
        Vid = vid;
        Purl = purl;
    }

    public Integer getSid() {
        return Sid;
    }

    public void setSid(Integer sid) {
        Sid = sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSregion() {
        return Sregion;
    }

    public void setSregion(String sregion) {
        Sregion = sregion;
    }

    public String getScountry() {
        return Scountry;
    }

    public void setScountry(String scountry) {
        Scountry = scountry;
    }

    public String getShistory() {
        return Shistory;
    }

    public void setShistory(String shistory) {
        Shistory = shistory;
    }

    public Integer getVid() {
        return Vid;
    }

    public void setVid(Integer vid) {
        Vid = vid;
    }

    public String getPurl() {
        return Purl;
    }

    public void setPurl(String purl) {
        Purl = purl;
    }
}
