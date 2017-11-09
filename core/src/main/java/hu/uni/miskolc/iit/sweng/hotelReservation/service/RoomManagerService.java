package hu.uni.miskolc.iit.sweng.hotelReservation.service;
import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.RoomType;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomNotfoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomalreadyExistException;

import java.util.Collection;



/*
Created By Ahmad Reda 26-10-2017
 */


public interface RoomManagerService {
    public Collection<Room> listAllrooms();
    public Collection<Room> listRoomByNumber(int number);
    public Collection<Room> listRoomByType(RoomType type );
    public Collection<Room> listRoomByCapacity(int capacity);

    public Room createRoom(int number, RoomType type, int capacity) throws RoomalreadyExistException;
    public Collection<Room> deleteRoom(int number, Collection<Room> rooms) throws RoomNotfoundException;

}
