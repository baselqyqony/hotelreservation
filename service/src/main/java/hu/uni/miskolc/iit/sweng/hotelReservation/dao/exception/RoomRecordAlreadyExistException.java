package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class RoomRecordAlreadyExistException extends PersistenceException {
    public RoomRecordAlreadyExistException() {
    }

    public RoomRecordAlreadyExistException(String message) {
        super(message);
    }

    public RoomRecordAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
