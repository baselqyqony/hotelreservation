package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

/**
 * created by Ahmad Reda
 */
public class RoomAlreadyExistException extends PersistnceException {
    public RoomAlreadyExistException() {
    }

    public RoomAlreadyExistException(String message) {
        super(message);
    }

    public RoomAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

}
