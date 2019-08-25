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
        if (car != null&&parkingLot.getCars().size() < parkingLot.getCapacity() ) {
            ParkingTicket parkingTicket = new ParkingTicket();
            this.parkingLot.getCars().put(parkingTicket, car);
            this.lastErrorMessage = null;
            return parkingTicket;
        }else{
            return null;
        }
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        //throw new RuntimeException("Not implemented");
        if (ticket != null && this.parkingLot.getCars().get(ticket) != null) {
            Car car = this.parkingLot.getCars().get(ticket);
            this.parkingLot.getCars().remove(ticket);
            this.lastErrorMessage = null;
            return car;
        }else if(ticket==null){
            this.lastErrorMessage="Please provide your parking ticket.";
            return null;
        }else{
            this.lastErrorMessage = "Unrecognized parking ticket.";
            return null;
        }

    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
