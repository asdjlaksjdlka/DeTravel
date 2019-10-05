package com.qf.detravel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Money
 * Dynamic实体类
 */
public class Flight implements Serializable {

    private String fId;                    //航班号
    private String fAirline;               //航空公司

    private String fDepartureCity;         //出发城市
    private String fDepartureAirport;      //出发机场
    private String fDepartureAirportShort; //出发机场缩写

    private String fArrivalCity;           //到达城市
    private String fArrivalAirport;        //到达机场
    private String fArrivalAirportShort;   //到达机场缩写

    private Date fDepartureTime;           //出发时间
    private Date fArrivalTime;             //到达时间
    private Double fPrice;                 //机票价格


    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getfAirline() {
        return fAirline;
    }

    public void setfAirline(String fAirline) {
        this.fAirline = fAirline;
    }

    public String getfDepartureCity() {
        return fDepartureCity;
    }

    public void setfDepartureCity(String fDepartureCity) {
        this.fDepartureCity = fDepartureCity;
    }

    public String getfDepartureAirport() {
        return fDepartureAirport;
    }

    public void setfDepartureAirport(String fDepartureAirport) {
        this.fDepartureAirport = fDepartureAirport;
    }

    public String getfDepartureAirportShort() {
        return fDepartureAirportShort;
    }

    public void setfDepartureAirportShort(String fDepartureAirportShort) {
        this.fDepartureAirportShort = fDepartureAirportShort;
    }

    public String getfArrivalCity() {
        return fArrivalCity;
    }

    public void setfArrivalCity(String fArrivalCity) {
        this.fArrivalCity = fArrivalCity;
    }

    public String getfArrivalAirport() {
        return fArrivalAirport;
    }

    public void setfArrivalAirport(String fArrivalAirport) {
        this.fArrivalAirport = fArrivalAirport;
    }

    public String getfArrivalAirportShort() {
        return fArrivalAirportShort;
    }

    public void setfArrivalAirportShort(String fArrivalAirportShort) {
        this.fArrivalAirportShort = fArrivalAirportShort;
    }

    public Date getfDepartureTime() {
        return fDepartureTime;
    }

    public void setfDepartureTime(Date fDepartureTime) {
        this.fDepartureTime = fDepartureTime;
    }

    public Date getfArrivalTime() {
        return fArrivalTime;
    }

    public void setfArrivalTime(Date fArrivalTime) {
        this.fArrivalTime = fArrivalTime;
    }

    public Double getfPrice() {
        return fPrice;
    }

    public void setfPrice(Double fPrice) {
        this.fPrice = fPrice;
    }

    public Flight() {
    }

    public Flight(String fId, String fAirline, String fDepartureCity, String fDepartureAirport, String fDepartureAirportShort, String fArrivalCity, String fArrivalAirport, String fArrivalAirportShort, Date fDepartureTime, Date fArrivalTime, Double fPrice) {
        this.fId = fId;
        this.fAirline = fAirline;
        this.fDepartureCity = fDepartureCity;
        this.fDepartureAirport = fDepartureAirport;
        this.fDepartureAirportShort = fDepartureAirportShort;
        this.fArrivalCity = fArrivalCity;
        this.fArrivalAirport = fArrivalAirport;
        this.fArrivalAirportShort = fArrivalAirportShort;
        this.fDepartureTime = fDepartureTime;
        this.fArrivalTime = fArrivalTime;
        this.fPrice = fPrice;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fId='" + fId + '\'' +
                ", fAirline='" + fAirline + '\'' +
                ", fDepartureCity='" + fDepartureCity + '\'' +
                ", fDepartureAirport='" + fDepartureAirport + '\'' +
                ", fDepartureAirportShort='" + fDepartureAirportShort + '\'' +
                ", fArrivalCity='" + fArrivalCity + '\'' +
                ", fArrivalAirport='" + fArrivalAirport + '\'' +
                ", fArrivalAirportShort='" + fArrivalAirportShort + '\'' +
                ", fDepartureTime='" + fDepartureTime + '\'' +
                ", fArrivalTime='" + fArrivalTime + '\'' +
                ", fPrice='" + fPrice + '\'' +
                '}';
    }
}
