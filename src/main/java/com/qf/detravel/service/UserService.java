package com.qf.detravel.service;


import com.qf.detravel.entity.User;

public interface UserService {

    User findByEmail(String uEmail,String uPassWord);


}
