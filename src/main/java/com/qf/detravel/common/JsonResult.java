package com.qf.detravel.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class JsonResult<T> {

    @ApiModelProperty(value = "返回数据状态",notes = "1 成功 0 失败")
    private Integer code;
    @ApiModelProperty(value = "返回数据",notes = "可以是具体的对象，也可以是null")
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
