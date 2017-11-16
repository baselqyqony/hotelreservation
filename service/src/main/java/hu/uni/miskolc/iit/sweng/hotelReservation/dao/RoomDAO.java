package hu.uni.miskolc.iit.sweng.hotelReservation.dao;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;

import java.util.Collection;

public interface RoomDAO {

    Collection<Room> readRoom();
    Collection<Room> readRoomByNumber(int number);
    Collection<Room> readRoomByType(RoomType room);
    Collection<Room> readRoomByCapacities(int capacity);

    void addRoom (Room room) throws RoomAlreadyExistException;
    void updateRoom (Room room) throws RoomNotFoundException;
    void deleteRoom (Room room) throws RoomNotFoundException;

}
