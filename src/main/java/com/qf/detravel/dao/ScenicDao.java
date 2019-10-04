package com.qf.detravel.dao;

import com.qf.detravel.entity.Scenic;

import java.util.List;

public interface ScenicDao {
    /**
     * 这里是根据地区查询所有国家
     * @param region 需要的地区名称
     * @return 返回的是所有国家名称
     */
    public List<String> findCountry(String region);

    /**
     * 这里是跟句国家查询所有的景点
     * @param country 需要的国家名称
     * @return 返回的是所有的景点名称
     */
    public List<String> findSName(String country);

    /**
     * 这里是根据国家查询所有的景点个数
     * @param country 需要的国家名称
     * @return 返回的是景点个数
     */
    public Integer count(String country);

    /**
     * 这是根据id查找景点信息
     * @param id 需要的id参数
     * @return 返回的是该景点的信息
     */
    public Scenic findScenic(Integer id);
}
