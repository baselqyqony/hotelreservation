package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class RoomNotFoundException extends PersistenceException {
    public RoomNotFoundException() {
    }

    public RoomNotFoundException(String message) {
        super(message);
    }

    public RoomNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
