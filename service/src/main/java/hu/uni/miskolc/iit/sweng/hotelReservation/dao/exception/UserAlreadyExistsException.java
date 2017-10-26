package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class UserAlreadyExistsException extends PersistenceException {
    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }

    public UserAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
