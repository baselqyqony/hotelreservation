package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class ReservationAlreadyExistException extends PersistenceException {
    public ReservationAlreadyExistException() {
    }

    public ReservationAlreadyExistException(String message) {
        super(message);
    }

    public ReservationAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
