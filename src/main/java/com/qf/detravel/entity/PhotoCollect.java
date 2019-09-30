package com.qf.detravel.entity;

import java.io.Serializable;

public class PhotoCollect implements Serializable {

    private Integer PcId;
    private Integer Uid;
    private Integer Pid;

    public PhotoCollect() {
    }

    public PhotoCollect(Integer pcId, Integer uid, Integer pid) {
        PcId = pcId;
        Uid = uid;
        Pid = pid;
    }

    public Integer getPcId() {
        return PcId;
    }

    public void setPcId(Integer pcId) {
        PcId = pcId;
    }

    public Integer getUid() {
        return Uid;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }
}
