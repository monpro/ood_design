package monpro.ood.parkinglot.parkingspots;

import monpro.ood.parkinglot.vehicle.Vehicle;

public class Large extends ParkingSpot {
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        if (isFree()) {
            this.vehicle = vehicle;
            isFree = false;
            return true;
        }
        return false;
    }
}