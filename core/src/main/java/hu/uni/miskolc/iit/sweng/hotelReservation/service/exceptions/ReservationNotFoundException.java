package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class ReservationNotFoundException extends PersistnceException {
    public ReservationNotFoundException() {
    }

    public ReservationNotFoundException(String message) {
        super(message);
    }

    public ReservationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}


