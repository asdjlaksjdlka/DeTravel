package com.qf.detravel.service.impl;

import com.qf.detravel.dao.ScenicDao;
import com.qf.detravel.entity.Scenic;
import com.qf.detravel.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicServiceImpl implements ScenicService {
    /**
     * 自动注入scenicDao对象
     */
    @Autowired
    private ScenicDao scenicDao;

    /**
     * 这是根据地区获取所有国家名称
     * @param region 需要的是地区名称
     * @return 返回的是所有国家名称
     */
    @Override
    public List<String> findCountry(String region) {
        return scenicDao.findCountry(region);
    }

    /**
     * 这是根据国家名称获取所有的景点名称
     * @param country 需要的是国家名称
     * @return 返回的是所有景点名称
     */
    @Override
    public List<String> findSName(String country) {
        return scenicDao.findSName(country);
    }

    /**
     * 这是根据国家名称获取所有的景点个数
     * @param country 需要的是国家名称
     * @return 返回的是该国家的所有景点个数
     */
    @Override
    public Integer count(String country) {
        return scenicDao.count(country);
    }

    /**
     * 这是根据id查找景点信息
     * @param id 需要的id参数
     * @return 返回的是该景点的信息
     */
    @Override
    public Scenic findScenic(Integer id) {
        return scenicDao.findScenic(id);
    }
}
