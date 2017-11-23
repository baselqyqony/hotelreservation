package hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception;

public class RoomRecordNotFoundException extends PersistenceException {
    public RoomRecordNotFoundException() {
    }

    public RoomRecordNotFoundException(String message) {
        super(message);
    }

    public RoomRecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
