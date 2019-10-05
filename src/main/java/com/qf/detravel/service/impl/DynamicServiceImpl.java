package com.qf.detravel.service.impl;

import com.qf.detravel.dao.DynamicDao;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    DynamicDao dynamicDao;

    @Override
    public void insertDynamic(Dynamic dynamic) {
        dynamicDao.insertDynamic(dynamic);
    }
}
