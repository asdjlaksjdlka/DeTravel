package com.qf.detravel.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel(value = "User对象",description = "用户对象属性")
public class User implements Serializable {
    @ApiModelProperty(value = "用户的id,数据库自增，不需要传",name = "uId")
    private Integer uId;
    @ApiModelProperty(value = "用户的姓名",name = "uName")
    private String uName;
    @ApiModelProperty(value = "用户的昵称",name = "uNickName")
    private String uNickName;
    @ApiModelProperty(value = "用户的邮箱",name = "uEmail")
    private String uEmail;
    @ApiModelProperty(value = "用户的密码",name = "uPassWord")
    private String uPassWord;
    @ApiModelProperty(value = "用户的电话",name = "uPhone")
    private String uPhone;
    @ApiModelProperty(value = "用户的头像地址",name = "uPicture")
    private String uPicture;

    public User() {
    }

    public User(Integer uId, String uName, String uNickName, String uEmail, String uPassWord, String uPhone, String uPicture) {
        this.uId = uId;
        this.uName = uName;
        this.uNickName = uNickName;
        this.uEmail = uEmail;
        this.uPassWord = uPassWord;
        this.uPhone = uPhone;
        this.uPicture = uPicture;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNickName() {
        return uNickName;
    }

    public void setuNickName(String uNickName) {
        this.uNickName = uNickName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPassWord() {
        return uPassWord;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uNickName='" + uNickName + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPassWord='" + uPassWord + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uPicture='" + uPicture + '\'' +
                '}';
    }
}
