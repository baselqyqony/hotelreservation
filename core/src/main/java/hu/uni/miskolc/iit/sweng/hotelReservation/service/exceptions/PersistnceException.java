package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class PersistnceException extends Exception {
    public PersistnceException() {
    }

    public PersistnceException(String message) {
        super(message);
    }

    public PersistnceException(String message, Throwable cause) {
        super(message, cause);
    }

}
