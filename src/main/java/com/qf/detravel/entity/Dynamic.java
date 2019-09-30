package com.qf.detravel.entity;

import java.io.Serializable;

public class Dynamic implements Serializable {
    private Integer Did;
    private String Ddesc;
    private String Dphoto;
    private String Dtime;
    private Integer Uid;

    public Dynamic() {
    }

    public Dynamic(Integer did, String ddesc, String dphoto, String dtime, Integer uid) {
        Did = did;
        Ddesc = ddesc;
        Dphoto = dphoto;
        Dtime = dtime;
        Uid = uid;
    }

    public Integer getDid() {
        return Did;
    }

    public void setDid(Integer did) {
        Did = did;
    }

    public String getDdesc() {
        return Ddesc;
    }

    public void setDdesc(String ddesc) {
        Ddesc = ddesc;
    }

    public String getDphoto() {
        return Dphoto;
    }

    public void setDphoto(String dphoto) {
        Dphoto = dphoto;
    }

    public String getDtime() {
        return Dtime;
    }

    public void setDtime(String dtime) {
        Dtime = dtime;
    }

    public Integer getUid() {
        return Uid;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }
}
