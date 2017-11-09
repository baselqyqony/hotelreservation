package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

/**
 * created by Ahmad Reda
 */
public class RoomalreadyExistException extends PersistnceException {
    public RoomalreadyExistException() {
    }

    public RoomalreadyExistException(String message) {
        super(message);
    }

    public RoomalreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

}
