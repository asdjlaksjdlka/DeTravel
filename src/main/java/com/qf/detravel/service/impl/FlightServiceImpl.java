package com.qf.detravel.service.impl;

import com.qf.detravel.dao.FlightDao;
import com.qf.detravel.entity.Flight;
import com.qf.detravel.entity.FlightTransit;
import com.qf.detravel.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDao flightDao;



    @Override
    public List findAll(String fDepartureCity, String fArrivalCity, Date fDepartureTime) {

        // 查询直达航班
        List<Flight> nonstop = flightDao.findAllNonstop(fDepartureCity, fArrivalCity ,fDepartureTime);

        // 查询中转航班
        List<FlightTransit> transit = flightDao.findAllTransit(fDepartureCity, fArrivalCity,fDepartureTime );


        System.out.println(nonstop);
        System.out.println("----------");
        System.out.println(transit);
        List<Object> allFlight = new ArrayList<>();
        allFlight.add(nonstop);
        allFlight.add(transit);


        return allFlight;

    }
}
