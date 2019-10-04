package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Scenic;
import com.qf.detravel.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ServletComponentScan
public class ScenicController {
    /**
     * 自动注入scenicService对象
     */
    @Autowired
    private ScenicService scenicService;

    /**
     * 这是根据地区获取所有国家名称
     *
     * @param region 需要的是地区名称
     * @return 返回的是JsonResult统一处理
     */
    @RequestMapping("/listCountry.do")
    public JsonResult findCountry(String region) {
        List<String> country = scenicService.findCountry(region);
        return new JsonResult(1, country);
    }

    /**
     * 这是根据国家名称获取所有的景点名称
     *
     * @param country 需要的是国家名称
     * @return 返回的是JsonResult统一处理
     */
    @RequestMapping("/listSName.do")
    public JsonResult findSname(String country) {

        List<String> sname = scenicService.findSName(country);
        return new JsonResult(1, sname);
    }

    /**
     * 这是根据国家名称获取所有的景点个数
     *
     * @param country 需要的是国家名称
     * @return 返回的是JsonResult统一处理
     */
    @RequestMapping("/count.do")
    public JsonResult sNameCount(String country) {
        Integer count = scenicService.count(country);
        return new JsonResult(1, count);
    }

    /**
     * 这是根据id查找景点信息的方法
     * @param id 需要的是id号
     * @return 返回的是景点信息
     */
    @RequestMapping("/scenic.do")
    public JsonResult findScenic(Integer id) {
        Scenic scenic = scenicService.findScenic(id);
        return new JsonResult(1, scenic);
    }
}
