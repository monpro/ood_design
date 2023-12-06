package monpro.ood.parkinglot.vehicle;

import monpro.ood.parkinglot.parkingspots.ParkingTicket;

public class Car extends Vehicle {
    @Override
    public void assignTicket(ParkingTicket ticket) {
        ticket.setVehicle(this);
    }
}
