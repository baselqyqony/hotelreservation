package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class UserNotfoundException extends PersistnceException {
    public UserNotfoundException() {
    }

    public UserNotfoundException(String message) {
        super(message);
    }

    public UserNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
