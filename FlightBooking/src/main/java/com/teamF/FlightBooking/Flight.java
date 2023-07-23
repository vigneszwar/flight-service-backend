package com.teamF.FlightBooking;

import java.util.*;

public class Flight {

    private String flightNo;
    private Airline company;
    private int seatCapacity;
    private List<Seat> seat;

    public Flight(String flightNo, Airline company, int seatCapacity, List<Seat> seat) {
        this.flightNo = flightNo;
        this.company = company;
        this.seatCapacity = seatCapacity;
        this.seat = seat;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Airline getCompany() {
        return company;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public List<Seat> getSeat() {
        return seat;
    }

}
