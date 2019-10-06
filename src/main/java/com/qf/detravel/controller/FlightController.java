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

    //查询单程或者往返航班
    @ApiOperation(value="查询单程或往返航班(直飞和中转)", notes="根据出发城市，达到城市，出发时间来查询航班信息，如果不输入返程时间则只查询单程机票，反之，查询往返机票")
    @PostMapping("/findFlight.do")
    public JsonResult findAllFlight(String fDepartureCity, String fArrivalCity,String fAirline,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date fDepartureTime,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date fReturnDepartureTime) {

        System.out.println(fDepartureCity + "---" + fArrivalCity+"----"+fDepartureTime+"---"+fReturnDepartureTime);
        try {
            Map allFlight = flightService.findAllFlight(fDepartureCity, fArrivalCity, fDepartureTime, fReturnDepartureTime,fAirline);
            return new JsonResult(1, allFlight);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "查询失败");
        }
    }

    //查询单程航班
    @ApiOperation(value="支付", notes="")
    @PostMapping("/pay.do")
    public JsonResult pay(){
        return new JsonResult(1, "支付成功");
    }
}
