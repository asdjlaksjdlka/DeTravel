package com.qf.detravel.entity;

import java.io.Serializable;
/**
 * @author Money
 * PhotoCollect实体类
 */
public class PhotoCollect implements Serializable {

    private Integer pCId;
    private Integer uId;
    private Integer pId;

    public PhotoCollect() {
    }

    public PhotoCollect(Integer pCId, Integer uId, Integer pId) {
        this.pCId = pCId;
        this.uId = uId;
        this.pId = pId;
    }

    public Integer getpCId() {
        return this.pCId;
    }

    public void setpCId(Integer pCId) {
        this.pCId = pCId;
    }

    public Integer getuId() {
        return this.uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getpId() {
        return this.pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}
