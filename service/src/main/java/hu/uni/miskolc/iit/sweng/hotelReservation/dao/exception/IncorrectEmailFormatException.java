package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class IncorrectEmailFormatException extends PersistenceException {
    public IncorrectEmailFormatException() {
    }

    public IncorrectEmailFormatException(String message) {
        super(message);
    }

    public IncorrectEmailFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
