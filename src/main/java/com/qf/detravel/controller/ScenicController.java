package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Scenic;
import com.qf.detravel.service.ScenicService;
import com.qf.detravel.vo.ScenicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@ServletComponentScan
public class ScenicController {
    /**
     * 自动注入scenicService对象
     */
    @Autowired
    private ScenicService scenicService;

    @GetMapping("/allScenic.do")
    public JsonResult findAllScenic(Integer vId, String region){
        List<Scenic> allScenic = scenicService.findAllScenic(vId, region);
        return new JsonResult(1, allScenic);
    }
    @GetMapping("/countryScenic.do")
    public JsonResult findAllByCountry(Integer vId, String region, String country) {
        List<Scenic> allByCountry = scenicService.findAllByCountry(vId, region, country);
        return new JsonResult(1, allByCountry);
    }
    @GetMapping("/scenicCount.do")
    public JsonResult findCountryCount(Integer vId, String region, String country) {
        Map<String, Integer> map = scenicService.findCountryCount(vId, region, country);
        return new JsonResult(1, map);
    }
    @GetMapping("/scenicDesc.do")
    public JsonResult findScenic(Integer vId, String name, String region, String country){
        ScenicVo scenicVo = scenicService.findScenic(vId, name, region, country);
        return new JsonResult(1, scenicVo);
    }
}
