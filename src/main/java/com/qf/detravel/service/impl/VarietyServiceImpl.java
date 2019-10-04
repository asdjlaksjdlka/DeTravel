package com.qf.detravel.service.impl;

import com.qf.detravel.dao.VarietyDao;
import com.qf.detravel.entity.Variety;
import com.qf.detravel.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyServiceImpl implements VarietyService {

    @Autowired
    VarietyDao varietyDao;

    @Override
    public List<Variety> findAllVariety() {
        return varietyDao.findAllVariety();
    }
}
