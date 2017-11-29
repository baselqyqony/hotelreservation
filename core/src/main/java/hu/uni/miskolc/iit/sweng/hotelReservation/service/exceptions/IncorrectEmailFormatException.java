package hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions;

public class IncorrectEmailFormatException extends Exception{
    public IncorrectEmailFormatException() {
    }

    public IncorrectEmailFormatException(String message) {
        super(message);
    }

    public IncorrectEmailFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
