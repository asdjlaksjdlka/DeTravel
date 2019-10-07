package com.qf.detravel.dao;

import com.qf.detravel.entity.User;
import java.util.List;
import java.util.Map;

public interface UserDao {

    User findByEmail(String email);

    User findByUNickName(String uNickName);
    String findUNickName(String uNickName);
    void updateByUserId(User user);

    void add(User user);

    String findPicture(Integer uId);

    User findUserById(Integer id);

    List<User> fans(Integer uid);

    void insertAttention(Map<String,Integer> map);

    void updatePassword(User user);
}
