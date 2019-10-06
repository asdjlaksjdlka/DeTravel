package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Scenic;
import com.qf.detravel.service.ScenicService;
import com.qf.detravel.vo.ScenicVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@Api(description ="景点信息展示")
@RestController
@ServletComponentScan
public class ScenicController {
    /**
     * 自动注入scenicService对象
     */
    @Autowired
    private ScenicService scenicService;
    @ApiOperation(value="查询所有的景点信息", notes="根据分类id和地区来查询所有的景点信息")
    @GetMapping("/allScenic.do")
    public JsonResult findAllScenic(Integer vId, String region){
        List<Scenic> allScenic = scenicService.findAllScenic(vId, region);
        return new JsonResult(1, allScenic);
    }
    @ApiOperation(value="查询地区所属国家所有的景点信息", notes="根据分类id，地区和国家来查询所有的景点信息")
    @GetMapping("/countryScenic.do")
    public JsonResult findAllByCountry(Integer vId, String region, String country) {
        List<Scenic> allByCountry = scenicService.findAllByCountry(vId, region, country);
        return new JsonResult(1, allByCountry);
    }
    @ApiOperation(value="查询地区所属国家和国家内景点个数", notes="根据分类id，地区和国家来查询所有的景点信息")
    @GetMapping("/scenicCount.do")
    public JsonResult findCountryCount(Integer vId, String region, String country) {
        Map<String, Integer> map = scenicService.findCountryCount(vId, region, country);
        return new JsonResult(1, map);
    }
    @ApiOperation(value="查询景点详细信息", notes="根据分类id，景点名称，地区和国家查询")
    @GetMapping("/scenicDesc.do")
    public JsonResult findScenic(Integer vId, String name, String region, String country){
        ScenicVo scenicVo = scenicService.findScenic(vId, name, region, country);
        return new JsonResult(1, scenicVo);
    }
}
