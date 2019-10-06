package com.qf.detravel.service;

import java.util.Date;
import java.util.List;

public interface FlightService {

    // 查询所有搜索条件(出发城市，到达城市，航空公司)
    List findAllQuery();

    // 查询所有符合条件航班
    List findAllFlight(String fDepartureCity, String fArrivalCity, Date fDepartureTime, String fAirline);
}
