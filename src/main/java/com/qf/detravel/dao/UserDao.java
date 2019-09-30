package com.qf.detravel.dao;

import com.qf.detravel.entity.User;

public interface UserDao {

    User findByEmail(String email);

    User findByUNickName(String uNickName);

    void add(User user);



}
