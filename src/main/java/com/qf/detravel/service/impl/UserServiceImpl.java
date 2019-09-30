package com.qf.detravel.service.impl;

import com.qf.detravel.dao.UserDao;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public User findByEmail(String uEmail, String uPassWord) {

        User user = userDao.findByEmail(uEmail);
        if (user == null){
            throw new RuntimeException("账号不存在");
        }else if (!uPassWord.equals(user.getuPassWord())){
            throw new RuntimeException("账号密码错误");
        }else {
            return user;
        }
    }
}
