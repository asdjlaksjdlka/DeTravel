package com.qf.detravel.dao;

import com.qf.detravel.entity.User;

public interface UserDao {

    User findByEmail(String email);

    User findByUNickName(String uNickName);

    User updateByUserId(Integer uId);

    void add(User user);



}
