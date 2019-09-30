package com.qf.detravel.entity;

import java.io.Serializable;

/**
 * @author Money
 * Variety实体类
 */
public class Variety implements Serializable {
    private Integer vId;
    private String vName;
    private String vDesc;

    public Variety() {
    }

    public Variety(Integer vId, String vName, String vDesc) {
        this.vId = vId;
        this.vName = vName;
        this.vDesc = vDesc;
    }

    public Integer getvId() {
        return this.vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvName() {
        return this.vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvDesc() {
        return this.vDesc;
    }

    public void setvDesc(String vDesc) {
        this.vDesc = vDesc;
    }
}
