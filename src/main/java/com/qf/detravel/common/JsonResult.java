package com.qf.detravel.common;

public class JsonResult<T> {

    private Integer code;
    private T info;

    public JsonResult() {
    }

    public JsonResult(Integer code, T info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", info=" + info +
                '}';
    }
}
