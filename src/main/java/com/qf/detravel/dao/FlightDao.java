package com.qf.detravel.dao;

import com.qf.detravel.entity.Flight;
import com.qf.detravel.entity.FlightTransit;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FlightDao {

    void add(Flight flight);

    // 查询所有出发城市
    List findAllDepartureCity();

    // 查询所有到达城市
    List findAllArrivalCity();

    // 查询所有航空公司
    List findAllAirline();

    // 查询所有符合条件(出发地点，到达地点，出发时间，航空公司)直达航班
    List findAllNonstop(@Param("fDepartureCity") String fDepartureCity, @Param("fArrivalCity")String fArrivalCity, @Param("fDepartureTime") Date fDepartureTime, @Param("fAirline")String fAirline);

    // 查询所有符合条件(同上)中转航班
    List<FlightTransit> findAllTransit(@Param("fDepartureCity") String fDepartureCity, @Param("fArrivalCity")String fArrivalCity,@Param("fDepartureTime") Date fDepartureTime,@Param("fAirline")String fAirline);
}
