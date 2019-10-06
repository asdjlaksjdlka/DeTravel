package com.qf.detravel.service.impl;

import com.qf.detravel.dao.DynamicDao;
import com.qf.detravel.dao.PhotoDao;
import com.qf.detravel.dao.UserDao;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.entity.Photo;
import com.qf.detravel.entity.User;
import com.qf.detravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserDao userDao;

    @Autowired(required = false)
    DynamicDao dynamicDao;

    @Autowired(required = false)
    PhotoDao photoDao;

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
    public void updateByUserId(User user) {
        userDao.updateByUserId(user);

    }

    //添加用户
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public Integer findEmailCount(String uEmail) {
        return userDao.findEmailCount(uEmail);
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

    @Override
    public Map showUserHomePage(Integer id) {
        HashMap<String,Object> map = new HashMap<>();
        //动态个数和图片
        List<Dynamic> dynamicList = dynamicDao.findAllDynamicByUserId(id);
        Integer countDynamic = dynamicDao.countDynamic(id);
        //图片个数和图片
        List<Photo> photos = photoDao.findPhotosById(id);
        Integer countPhoto = photoDao.countPhoto(id);
        //粉丝数量和信息
        List<User> fans = userDao.fans(id);
        Integer countFans = fans.size();

        map.put("dynamicList",dynamicList);
        map.put("dynamicCount",countDynamic);
        map.put("photoList",photos);
        map.put("photoCount",countPhoto);
        map.put("fansList",fans);
        map.put("fansCount",countFans);
        
        return map;
    }

    @Override
    public void insertAttention(Integer uid, Integer fid) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("uid",uid);
        map.put("fid",fid);
        userDao.insertAttention(map);

    }
}
