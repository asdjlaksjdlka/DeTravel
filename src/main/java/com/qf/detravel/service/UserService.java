package com.qf.detravel.service;


import com.qf.detravel.entity.User;

import java.util.List;

public interface UserService {

    User findByEmail(String uEmail,String uPassWord);

    void updateByUserId(User user);
    User findByIdUser(Integer uId);
    String findPicture(Integer uId);
    User findUserByNotId(Integer uId);

    void add(User user);
    void findUNickName(User user);
//    void  findEmail(User user);


    //注册验证，邮箱和昵称不能重复
    void signIn(String uNickName, String uEmail);

}
