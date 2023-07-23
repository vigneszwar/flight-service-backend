package com.teamF.FlightBooking;

public class FlightSeat extends Seat {

    private Status status;
    private int price;

    public FlightSeat(String numberNo, String className, Status status, int price) {
        super(numberNo, className);
        this.status = status;
        this.price = price;
    }
}