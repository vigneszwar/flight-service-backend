package com.teamF.FlightBooking;

import java.util.*;
public class Airline { private String name;
    private List<Flight> flights;

    public Airline(String name, List<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }

    public String getName() {

        return name;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}

