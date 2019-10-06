package com.qf.detravel.entity;

import java.io.Serializable;

public class FlightTransit implements Serializable {
    private Flight beginFlight;
    private Flight endFlight;

    private Flight beginFlight2;
    private Flight endFlight2;



    public Flight getBeginFlight() {
        return beginFlight;
    }

    public void setBeginFlight(Flight beginFlight) {
        this.beginFlight = beginFlight;
    }

    public Flight getEndFlight() {
        return endFlight;
    }

    public void setEndFlight(Flight endFlight) {
        this.endFlight = endFlight;
    }

    public Flight getBeginFlight2() {
        return beginFlight2;
    }

    public void setBeginFlight2(Flight beginFlight2) {
        this.beginFlight2 = beginFlight2;
    }

    public Flight getEndFlight2() {
        return endFlight2;
    }

    public void setEndFlight2(Flight endFlight2) {
        this.endFlight2 = endFlight2;
    }

    @Override
    public String toString() {
        return "FlightTransit{" +
                "beginFlight=" + beginFlight +
                ", endFlight=" + endFlight +
                ", beginFlight2=" + beginFlight2 +
                ", endFlight2=" + endFlight2 +
                '}';
    }
}
