package monpro.ood.parkinglot;

public abstract class ParkingSpot {
    protected int id;
    protected boolean isFree;
    protected Vehicle vehicle;

    public boolean isFree() {
        return isFree;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        if (vehicle != null) {
            vehicle = null;
            isFree = true;
            return true;
        }
        return false;
    }
}
