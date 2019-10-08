package com.qf.detravel.service.impl;

import com.qf.detravel.dao.FlightDao;
import com.qf.detravel.entity.Flight;
import com.qf.detravel.entity.FlightTransit;
import com.qf.detravel.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDao flightDao;

    @Override
    public Map findAllQuery() {

        //查询所有航空公司
        List allAirline = flightDao.findAllAirline();

        //查询所有出发城市
        List allDepartureCity = flightDao.findAllDepartureCity();

        //查询所有到达城市
        List allArrivalCity = flightDao.findAllArrivalCity();

        HashMap<Object, Object> allQuery = new HashMap<>();

        allQuery.put("DepartureCity", allDepartureCity);
        allQuery.put("ArrivalCity", allArrivalCity);
        allQuery.put("Airline", allAirline);

        System.out.println(allQuery);

        return allQuery;
    }

    @Override
    public Map findAllFlight(String fDepartureCity, String fArrivalCity, Date fDepartureTime, Date fReturnDepartureTime, String fAirline) {

        String a = "";
        // 查询单程直达航班
        List<Flight> nonstop = flightDao.findAllNonstop(fDepartureCity, fArrivalCity, fDepartureTime, fAirline);

        // 查询单程中转航班
        List<FlightTransit> transit = flightDao.findAllTransit(fDepartureCity, fArrivalCity, fDepartureTime, fAirline);

        HashMap<Object, Object> allStartFlight = new HashMap<>();

        allStartFlight.put("nonstop", nonstop);
        allStartFlight.put("transit", transit);

        if (fReturnDepartureTime != null && fReturnDepartureTime.toString() != "") {
            a = fDepartureCity ;
            fDepartureCity = fArrivalCity;
            fArrivalCity = a ;
            // 查询返程直达航班
            List<Flight> returnNonstop = flightDao.findAllNonstop(fDepartureCity, fArrivalCity, fReturnDepartureTime, fAirline);

            // 查询返程中转航班
            List<FlightTransit> returnTransit = flightDao.findAllTransit(fDepartureCity, fArrivalCity, fReturnDepartureTime, fAirline);

            HashMap<Object, Object> allReturnFlight = new HashMap<>();
            allReturnFlight.put("returnNonstop", returnNonstop);
            allReturnFlight.put("returnTransit", returnTransit);

            HashMap<Object, Object> allFlight = new HashMap<>();
            allFlight.put("allStartFlight", allStartFlight);
            allFlight.put("allReturnFlight", allReturnFlight);

            return allFlight;
        }

        return allStartFlight;
    }
}
