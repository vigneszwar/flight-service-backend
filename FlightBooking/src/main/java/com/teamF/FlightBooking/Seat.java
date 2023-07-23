package com.teamF.FlightBooking;

public class Seat {
    private String numberNo;
    private String className;

    public Seat(String numberNo, String className) {
        this.numberNo = numberNo;
        this.className = className;
    }

    public String getNumberNo() {
        return numberNo;
    }

    public String getClassName() {
        return className;
    }

}
