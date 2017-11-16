package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class ReservationAlreadyExistException extends PersistnceException{

    public ReservationAlreadyExistException() {
    }

    public ReservationAlreadyExistException(String message) {
        super(message);
    }

    public ReservationAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
