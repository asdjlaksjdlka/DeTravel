package com.qf.detravel.entity;

import java.io.Serializable;

public class Variety implements Serializable {
    private Integer Vid;
    private String Vname;
    private String text;

    public Variety() {
    }

    public Variety(Integer vid, String vname, String text) {
        Vid = vid;
        Vname = vname;
        this.text = text;
    }

    public Integer getVid() {
        return Vid;
    }

    public void setVid(Integer vid) {
        Vid = vid;
    }

    public String getVname() {
        return Vname;
    }

    public void setVname(String vname) {
        Vname = vname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
