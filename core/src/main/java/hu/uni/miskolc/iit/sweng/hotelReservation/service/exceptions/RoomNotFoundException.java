package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class RoomNotFoundException extends PersistnceException {
    public RoomNotFoundException() {
    }

    public RoomNotFoundException(String message) {
        super(message);
    }

    public RoomNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
