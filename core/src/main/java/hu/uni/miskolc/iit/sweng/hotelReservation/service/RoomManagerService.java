package hu.uni.miskolc.iit.sweng.hotelReservation.service;


import hu.uni.miskolc.iit.sweng.hotelReservation.model.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.RoomType;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomAlreadyExistException;

import java.util.Collection;



/*
Created By Ahmad Reda 26-10-2017
 */


public interface RoomManagerService {

    /**
     * Returns with a collection which contains all rooms.
     * @return
     */
    Collection<Room> listAllrooms();
    Collection<Room> listRoomByNumber(int number);
    Collection<Room> listRoomByType(RoomType type );
    Collection<Room> listRoomByCapacity(int capacity);

    Room createRoom(int number, RoomType type, int capacity) throws RoomAlreadyExistException;
    Collection<Room> deleteRoom(int number, Collection<Room> rooms) throws RoomNotFoundException;

}
