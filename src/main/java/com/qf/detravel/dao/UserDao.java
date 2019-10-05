package com.qf.detravel.dao;

import com.qf.detravel.entity.User;

public interface UserDao {

    User findByEmail(String email);

    User findByUNickName(String uNickName);

    void updateByUserId(User user);

    void add(User user);
    Integer findEmailCount(String uEmail);



}
