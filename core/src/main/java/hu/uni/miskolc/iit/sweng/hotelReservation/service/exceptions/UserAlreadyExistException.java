package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class UserAlreadyExistException extends PersistnceException {
    public UserAlreadyExistException() {
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }

    public UserAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }


}
