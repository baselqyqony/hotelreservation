package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class RoomAlreadyExistException extends PersistenceException {
    public RoomAlreadyExistException() {
    }

    public RoomAlreadyExistException(String message) {
        super(message);
    }

    public RoomAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
