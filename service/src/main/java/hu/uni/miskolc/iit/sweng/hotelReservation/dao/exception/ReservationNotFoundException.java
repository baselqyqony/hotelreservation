package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class ReservationNotFoundException extends PersistenceException {
    public ReservationNotFoundException() {
    }

    public ReservationNotFoundException(String message) {
        super(message);
    }

    public ReservationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
