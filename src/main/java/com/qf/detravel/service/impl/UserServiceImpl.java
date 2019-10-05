package com.qf.detravel.service.impl;

import com.qf.detravel.dao.UserDao;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserDao userDao;

    //登录
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

    @Override
    public User updateByUserId(Integer uId) {
       return userDao.updateByUserId(uId);
    }

    //添加用户
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    //注册验证，昵称，邮箱不能重复
    @Override
    public void signIn(String uNickName, String uEmail) {



        User byUNickName = userDao.findByUNickName(uNickName);
        User byEmail = userDao.findByEmail(uEmail);
        if (byEmail != null){
            throw new RuntimeException("邮箱已被注册");
        }
        if (byUNickName != null){
            throw new RuntimeException("昵称已被注册");
        }


    }
}
