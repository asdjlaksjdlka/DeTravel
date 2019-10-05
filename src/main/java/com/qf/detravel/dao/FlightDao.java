package com.qf.detravel.dao;

import com.qf.detravel.entity.FlightTransit;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FlightDao {

    // 查询所有直达航班
    List findAllNonstop(@Param("fDepartureCity") String fDepartureCity, @Param("fArrivalCity")String fArrivalCity,@Param("fDepartureTime") Date fDepartureTime);

    // 查询所有中转航班
    List<FlightTransit> findAllTransit(@Param("fDepartureCity") String fDepartureCity, @Param("fArrivalCity")String fArrivalCity,@Param("fDepartureTime") Date fDepartureTime);
}
