package com.qf.detravel.service.impl;

import com.qf.detravel.dao.ScenicDao;
import com.qf.detravel.entity.Scenic;
import com.qf.detravel.service.ScenicService;
import com.qf.detravel.vo.ScenicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;

@Service
public class ScenicServiceImpl implements ScenicService {
    /**
     * 自动注入scenicDao对象
     */
    @Autowired
    private ScenicDao scenicDao;


    @Override
    public List<Scenic> findAllScenic(Integer vId, String region) {
        return scenicDao.findAllScenic(vId, region);
    }

    @Override
    public List<Scenic> findAllByCountry(Integer vId, String region, String country) {
        return scenicDao.findAllByCountry(vId, region, country);
    }

    @Override
    public Map<String, Integer> findCountryCount(Integer vId, String region, String country) {
        return scenicDao.findCountryCount(vId, region, country);
    }

    @Override
    public ScenicVo findScenic(Integer vId, String name, String region, String country) {
        return scenicDao.findScenic(vId, name, region, country);
    }
}
