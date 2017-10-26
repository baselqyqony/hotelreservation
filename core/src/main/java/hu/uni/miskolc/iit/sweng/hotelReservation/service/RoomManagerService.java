package hu.uni.miskolc.iit.sweng.hotelReservation.service;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.RoomType;
import java.util.Collection;
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
