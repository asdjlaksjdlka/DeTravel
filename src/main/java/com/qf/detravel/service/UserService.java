package com.qf.detravel.service;


import com.qf.detravel.entity.User;

public interface UserService {

    User findByEmail(String uEmail,String uPassWord);

    void updateByUserId(User user);

    void add(User user);
    Integer findEmailCount(String uEmail);

    //注册验证，邮箱和昵称不能重复
    void signIn(String uNickName, String uEmail);

}
