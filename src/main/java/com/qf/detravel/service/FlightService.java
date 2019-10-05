package com.qf.detravel.service;

import java.util.Date;
import java.util.List;

public interface FlightService {
    // 查询所有航班
    List findAll(String fDepartureCity, String fArrivalCity, Date fDepartureTime);
}
