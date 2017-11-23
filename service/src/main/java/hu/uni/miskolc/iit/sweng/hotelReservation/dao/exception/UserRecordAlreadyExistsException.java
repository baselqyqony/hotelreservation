package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class UserRecordAlreadyExistsException extends PersistenceException {
    public UserRecordAlreadyExistsException() {
    }

    public UserRecordAlreadyExistsException(String message) {
        super(message);
    }

    public UserRecordAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
