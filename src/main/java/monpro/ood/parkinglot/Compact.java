package monpro.ood.parkinglot;

public class Compact extends ParkingSpot {

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
