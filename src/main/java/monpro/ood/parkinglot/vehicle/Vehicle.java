package monpro.ood.parkinglot.vehicle;

import monpro.ood.parkinglot.parkingspots.ParkingTicket;

public abstract class Vehicle {
    private String licenseNumber;

    public abstract void assignTicket(ParkingTicket ticket);

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
