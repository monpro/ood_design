package monpro.ood.parkinglot.parkingspots;

import monpro.ood.parkinglot.vehicle.Vehicle;

public class ParkingTicket {
    private String ticketNumber;
    private String issuedAt;
    private String payedAt;
    private double payedAmount;
    private double amount;
    private boolean isPayed;
    private Vehicle vehicle;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public String getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(String payedAt) {
        this.payedAt = payedAt;
    }

    public double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
