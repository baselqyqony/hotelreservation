package hu.uni.miskolc.iit.sweng.hotelReservation.service;

import hu.uni.miskolc.iit.sweng.hotelReservation.model.RoomType;
mport hu.uni.miskolc.iit.sweng.hotelReservation.model.Room;
public interface RoomManagerService {
    public Collection<Room> listAllrooms();
    public Collection<Room> listRoomByNumber(int number);
    public Collection<Room> listRoomByType(RoomType type );
    public Collection<Room> listRoomByCapacity(int capacity);

    public Room createRoom(int number,
                           RoomType type,
                           int capacity);
       public Collection<Room> deleteRoom(int number,
                           RoomType type,
                           int capacity);

}
