package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class UserRecordNotFoundException extends PersistenceException{
    public UserRecordNotFoundException() {
    }

    public UserRecordNotFoundException(String message) {
        super(message);
    }

    public UserRecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
