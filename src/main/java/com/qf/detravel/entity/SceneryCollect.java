package com.qf.detravel.entity;
/**
 * @author Money
 * SceneryCollect实体类
 */
public class SceneryCollect {
    private Integer sCId;
    private Integer uId;
    private Integer sId;

    public SceneryCollect() {
    }

    public SceneryCollect(Integer sCId, Integer uId, Integer sId) {
        this.sCId = sCId;
        this.uId = uId;
        this.sId = sId;
    }

    public Integer getsCId() {
        return this.sCId;
    }

    public void setsCId(Integer sCId) {
        this.sCId = sCId;
    }

    public Integer getuId() {
        return this.uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getsId() {
        return this.sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
}
