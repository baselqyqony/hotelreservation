package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class UserNotFoundException extends PersistnceException {
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
