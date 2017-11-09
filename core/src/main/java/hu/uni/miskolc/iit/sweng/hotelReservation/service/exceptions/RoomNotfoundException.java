package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class RoomNotfoundException extends PersistnceException {
    public RoomNotfoundException() {
    }

    public RoomNotfoundException(String message) {
        super(message);
    }

    public RoomNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
