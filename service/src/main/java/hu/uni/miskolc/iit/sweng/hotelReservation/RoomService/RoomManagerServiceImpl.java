package hu.uni.miskolc.iit.sweng.hotelReservation.RoomService;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.RoomDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.RoomManagerService;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.RoomNotFoundException;


import java.util.Collection;

/**
 * @author Ahmad Reda
 *
 *
 */
public  class RoomManagerServiceImpl implements RoomManagerService {
    /**
     * room data access object
     */
    private RoomDAO roomDao;

    public RoomManagerServiceImpl(RoomDAO roomDao){this.roomDao=roomDao;}

       public Collection<Room> listAllrooms() {
        return roomDao.readRoom();
    }

    public Room listRoomByNumber(int number) throws RoomNotFoundException {
        try {
            return roomDao.readRoomByNumber(number);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Collection<Room> listRoomByType(RoomType type)
    {
        try {
            return roomDao.readRoomByType(type);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Collection<Room> listRoomByCapacity(int capacity)
    {
        try {
            return roomDao.readRoomByCapacities(capacity);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Room createRoom(int number, RoomType type, int capacity) throws RoomAlreadyExistException {
        Room room=new Room(number,type,capacity);
        try {
            roomDao.createRoom(room);
        }
        catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomAlreadyExistException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteRoom(Room room) throws RoomNotFoundException {
        try {
            roomDao.deleteRoom(room);
        }
            catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomNotFoundException e) {
            e.printStackTrace();
        }
    }


    }

