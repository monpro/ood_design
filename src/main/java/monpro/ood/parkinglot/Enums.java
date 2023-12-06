package monpro.ood.parkinglot;

public class Enums {
    enum PaymentStatus {
        COMPLETED,
        PENDING,
        UNPAID,
        FAILED,
        REFUNDED
    }

    enum AccountStatus {
        ACTIVE,
        CANCELLED,
        CLOSED,
        BLACKLISTED,
        NONE
    }
}
