package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class UserNotFoundException extends PersistenceException{
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
