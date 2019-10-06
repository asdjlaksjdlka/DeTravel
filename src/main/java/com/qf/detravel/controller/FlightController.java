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
import java.util.List;

@Api(description ="航班查询API")
@ServletComponentScan
@Controller
@RequestMapping("/flight")
@ResponseBody
public class FlightController {

    @Autowired
    FlightService flightService;

    @ApiOperation(value="查询航班", notes="根据出发城市，达到城市，出发时间来查询航班信息")
    @PostMapping("/find.do")
    public JsonResult findAll(String fDepartureCity, String fArrivalCity,@DateTimeFormat(pattern = "yyyy-MM-dd HH:ss:mm")Date fDepartureTime) {

        System.out.println(fDepartureCity + "---" + fArrivalCity+"----"+fDepartureTime);
        try {
            List allFlight = flightService.findAll(fDepartureCity, fArrivalCity, fDepartureTime);
            return new JsonResult(1, allFlight);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "查询失败");
        }
    }
}
