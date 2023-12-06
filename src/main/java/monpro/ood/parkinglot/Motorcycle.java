package monpro.ood.parkinglot;

public class Motorcycle extends ParkingSpot {
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
