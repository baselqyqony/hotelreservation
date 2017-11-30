package hu.uni.miskolc.iit.sweng.hotelReservation.dao;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;

import java.util.Collection;

/**
 * @author Ahmad Reda
 * */
public interface RoomDAO {
    /**
     *get all rooms
     * @return collection of rooms
     */
    Collection<Room> readRoom();

    /**
     *
     * @param number
     * @return room
     * @throws RoomRecordNotFoundException
     */
    Room readRoomByNumber(int number)  throws RoomRecordNotFoundException;

    /**
     *
     * @param type
     * @return collection of rooms
     * @throws RoomRecordNotFoundException
     */
    Collection<Room> readRoomByType(RoomType type)  throws RoomRecordNotFoundException;

    /**
     *
     * @param capacity
     * @return collection of rooms
     * @throws RoomRecordNotFoundException
     */
    Collection<Room> readRoomByCapacities(int capacity)  throws RoomRecordNotFoundException;

    /**
     * @param room
     * @return room
     * @throws RoomRecordAlreadyExistException
     */

    Room createRoom (Room room) throws RoomRecordAlreadyExistException;

    /**
     *
     * @param room
     * @returnboolean value indicate to that if the update process success or not.
     * @throws RoomRecordNotFoundException
     */
    boolean updateRoom(Room room) throws RoomRecordNotFoundException;

    /**
     *
     * @param room
     * @return boolean value indicate to that if the delete process success or not.
     * @throws RoomRecordNotFoundException
     */
    boolean deleteRoom (Room room) throws RoomRecordNotFoundException;

}
