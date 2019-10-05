package com.qf.detravel.entity;

import java.io.Serializable;

public class FlightTransit implements Serializable {
    private Flight beginFlight;
    private Flight endFlight;



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

    @Override
    public String toString() {
        return "FlightTransit{" +
                "beginFlight=" + beginFlight +
                ", endFlight=" + endFlight +
                '}';
    }
}
