package com.qf.detravel.dao;

import com.qf.detravel.entity.User;

import java.util.List;

public interface UserDao {

    User findByEmail(String email);

    User findByUNickName(String uNickName);

    void updateByUserId(User user);

    User findByIdUser(Integer uId);

    void add(User user);

    String findUNickName(String uNickName);
    String findEmail(String uEmail);

    String findPicture(Integer uId);



}
