package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
        //throw new RuntimeException("Not implemented");
        ParkingTicket parkingTicket = parkingLot.park(car);
        return parkingTicket;
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        //throw new RuntimeException("Not implemented");
        if (parkingLot.fetch(ticket)==null){
            this.lastErrorMessage = "Unrecognized parking ticket.";
            return null;
        }
        Car car = parkingLot.fetch(ticket);
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
