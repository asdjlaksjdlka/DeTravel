package com.qf.detravel.entity;

import java.io.Serializable;

public class Photo implements Serializable {

    private Integer Pid;
    private String Purl;
    private Integer Sid;

    public Photo() {
    }

    public Photo(Integer pid, String purl, Integer sid) {
        Pid = pid;
        Purl = purl;
        Sid = sid;
    }

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    public String getPurl() {
        return Purl;
    }

    public void setPurl(String purl) {
        Purl = purl;
    }

    public Integer getSid() {
        return Sid;
    }

    public void setSid(Integer sid) {
        Sid = sid;
    }
}
