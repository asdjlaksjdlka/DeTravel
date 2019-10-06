package com.qf.detravel.controller;


import com.qf.detravel.common.JsonResult;
import com.qf.detravel.service.FlightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Api(description ="航班查询API")
@ServletComponentScan
@Controller
@RequestMapping("/flight")
@ResponseBody
public class FlightController {

    @Autowired
    FlightService flightService;


    //查询搜索信息(出发城市，到达城市，航空公司)
    @ApiOperation(value="查询搜索信息(出发城市，到达城市，航空公司)")
    @PostMapping("/findQuery.do")
    public JsonResult findAllQuery(String fDepartureCity, String fArrivalCity,String fAirline,@DateTimeFormat(pattern = "yyyy-MM-dd HH:ss:mm")Date fDepartureTime) {

        System.out.println(fDepartureCity + "---" + fArrivalCity+"----"+fDepartureTime);
        try {
            Map allQuery = flightService.findAllQuery();
            return new JsonResult(1, allQuery);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "加载失败");
        }
    }

    //查询单程航班
    @ApiOperation(value="查询单程航班(直飞和中转)", notes="根据出发城市，达到城市，出发时间来查询航班信息")
    @PostMapping("/findFlight.do")
    public JsonResult findAllFlight(String fDepartureCity, String fArrivalCity,String fAirline,@DateTimeFormat(pattern = "yyyy-MM-dd HH:ss:mm")Date fDepartureTime) {

        System.out.println(fDepartureCity + "---" + fArrivalCity+"----"+fDepartureTime);
        try {
            Map allFlight = flightService.findAllFlight(fDepartureCity, fArrivalCity, fDepartureTime, fAirline);
            return new JsonResult(1, allFlight);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "查询失败");
        }
    }
}
