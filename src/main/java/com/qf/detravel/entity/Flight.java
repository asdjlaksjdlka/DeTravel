package com.qf.detravel.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Money
 * Dynamic实体类
 */
public class Flight implements Serializable {

    @ApiModelProperty(name = "fId",value = "航班号",example = "PPE1214")
    private String fId;                    //航班号
    @ApiModelProperty(name = "fAirline",value = "航空公司",example = "北京hangk")
    private String fAirline;               //航空公司

    @ApiModelProperty(name = "fDepartureCity",value = "出发城市",example = "北京")
    private String fDepartureCity;         //出发城市
    @ApiModelProperty(name = "fDepartureAirport",value = "出发机场",example = "首都国际机场")
    private String fDepartureAirport;      //出发机场
    @ApiModelProperty(name = "fDepartureAirportShort",value = "出发机场缩写",example = "PEK")
    private String fDepartureAirportShort; //出发机场缩写

    @ApiModelProperty(name = "fArrivalCity",value = "到达城市",example = "仁川")
    private String fArrivalCity;           //到达城市
    @ApiModelProperty(name = "fArrivalAirport",value = "到达机场",example = "仁川国际机场")
    private String fArrivalAirport;        //到达机场
    @ApiModelProperty(name = "fArrivalAirportShort",value = "到达机场缩写",example = "GMP")
    private String fArrivalAirportShort;   //到达机场缩写

    @ApiModelProperty(name = "fDepartureTime",value = "出发时间",example = "2019-10-03 09:00:00")
    private Date fDepartureTime;           //出发时间
    @ApiModelProperty(name = "fArrivalTime",value = "到达时间",example = "2019-10-03 13:00:00")
    private Date fArrivalTime;             //到达时间
    @ApiModelProperty(name = "fPrice",value = "机票价格",example = "1000.00")
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
