package com.qf.detravel.service;

import com.qf.detravel.entity.Scenic;

import java.util.List;

public interface ScenicService {
    /**
     * 这是根据地区获取所有国家名称
     * @param region 需要的是地区名称
     * @return 返回的是所有国家名称
     */
    public List<String> findCountry(String region);

    /**
     * 这是根据国家名称获取所有的景点名称
     * @param country 需要的是国家名称
     * @return 返回的是所有的景点名称
     */
    public List<String> findSName(String country);

    /**
     * 这是根据国家名称获取所有的景点个数
     * @param country 需要的是国家名称
     * @return 返回的景点个数
     */
    public Integer count(String country);

    /**
     * 这是根据id查找景点信息
     * @param id 需要的id参数
     * @return 返回的是该景点的信息
     */
    public Scenic findScenic(Integer id);
}
