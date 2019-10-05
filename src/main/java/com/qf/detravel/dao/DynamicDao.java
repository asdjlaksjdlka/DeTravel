package com.qf.detravel.dao;

import com.qf.detravel.entity.Dynamic;

import java.util.List;

public interface DynamicDao {

    List<Dynamic> findAllDynamicByUserId(Integer id);

}
