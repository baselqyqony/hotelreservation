package hu.uni.miskolc.iit.sweng.hotelReservation.service;


import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomAlreadyExistException;

import java.util.Collection;

/**
 * @author Ahmad Reda
 */

public interface RoomManagerService {

    Collection<Room> listAllrooms();
    Room listRoomByNumber(int number) throws RoomNotFoundException;
    Collection<Room> listRoomByType(RoomType type ) throws RoomNotFoundException;
    Collection<Room> listRoomByCapacity(int capacity)throws RoomNotFoundException;

    Room createRoom (int number, RoomType type, int capacity) throws RoomAlreadyExistException;
    public void updateRoom (Room room)throws RoomNotFoundException;
    public void deleteRoom(Room room) throws RoomNotFoundException;

}
