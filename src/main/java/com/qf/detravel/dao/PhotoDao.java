package com.qf.detravel.dao;

import com.qf.detravel.entity.Photo;

import java.util.List;

public interface PhotoDao {

    Photo findByPId(Integer pid);

    List<Photo> findPhotosById(Integer uid);

    Integer countPhoto(Integer uid);
}
