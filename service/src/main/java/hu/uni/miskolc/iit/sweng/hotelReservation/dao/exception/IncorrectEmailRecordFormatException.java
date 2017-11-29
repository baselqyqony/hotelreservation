package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class IncorrectEmailRecordFormatException extends PersistenceException {
    public IncorrectEmailRecordFormatException() {
    }

    public IncorrectEmailRecordFormatException(String message) {
        super(message);
    }

    public IncorrectEmailRecordFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
