package hu.uni.miskolc.iit.sweng.hotelReservation.dao;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;

import java.util.Collection;

public interface RoomDAO {

    Collection<Room> readRoom();
    Room readRoomByNumber(int number)  throws RoomRecordNotFoundException;
    Collection<Room> readRoomByType(RoomType type)  throws RoomRecordNotFoundException;
    Collection<Room> readRoomByCapacities(int capacity)  throws RoomRecordNotFoundException;

    Room createRoom (Room room) throws RoomRecordAlreadyExistException;
    Room updateRoom (Room room) throws RoomRecordNotFoundException;
    void deleteRoom (Room room) throws RoomRecordNotFoundException;

}
