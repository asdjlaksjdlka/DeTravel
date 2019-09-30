package com.qf.detravel.entity;

public class SceneryCollect {
    private Integer ScId;
    private Integer Uid;
    private Integer Sid;

    public SceneryCollect() {
    }

    public SceneryCollect(Integer scId, Integer uid, Integer sid) {
        ScId = scId;
        Uid = uid;
        Sid = sid;
    }

    public Integer getScId() {
        return ScId;
    }

    public void setScId(Integer scId) {
        ScId = scId;
    }

    public Integer getUid() {
        return Uid;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }

    public Integer getSid() {
        return Sid;
    }

    public void setSid(Integer sid) {
        Sid = sid;
    }
}
