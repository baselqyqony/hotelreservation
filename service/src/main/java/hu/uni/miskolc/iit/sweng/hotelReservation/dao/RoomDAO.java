package hu.uni.miskolc.iit.sweng.hotelReservation.dao;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;

import java.util.Collection;

public interface RoomDAO {

    Collection<Room> readRoom();
    Room readRoomByNumber(int number)  throws RoomNotFoundException;
    Collection<Room> readRoomByType(RoomType type)  throws RoomNotFoundException;
    Collection<Room> readRoomByCapacities(int capacity)  throws RoomNotFoundException;

    Room createRoom (Room room) throws RoomAlreadyExistException;
    Room updateRoom (Room room) throws RoomNotFoundException;
    void deleteRoom (Room room) throws RoomNotFoundException;

}
