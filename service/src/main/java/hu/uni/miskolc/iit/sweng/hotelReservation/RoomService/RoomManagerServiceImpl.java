package hu.uni.miskolc.iit.sweng.hotelReservation.RoomService;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.RoomDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordNotFoundException;
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
        } catch (RoomRecordNotFoundException e) {
            throw new RoomNotFoundException("Room Not Found");
        }
    }

    public Collection<Room> listRoomByType(RoomType type)throws RoomNotFoundException
    {
        try {
            return roomDao.readRoomByType(type);
        } catch (RoomRecordNotFoundException e) {
            throw new RoomNotFoundException("Room Not Found");
        }
    }

    public Collection<Room> listRoomByCapacity(int capacity)throws RoomNotFoundException
    {
        try {
            return roomDao.readRoomByCapacities(capacity);
        } catch (RoomRecordNotFoundException e) {
            throw new RoomNotFoundException("Room Not Found");
        }
    }

    public Room createRoom(int number, RoomType type, int capacity) throws RoomAlreadyExistException {
        Room room=new Room(number,type,capacity);
        try {
            return roomDao.createRoom(room);
                    }
        catch (RoomRecordAlreadyExistException e) {
          throw new RoomAlreadyExistException("Room Already Exist");
        }

    }

    public void deleteRoom(Room room) throws RoomNotFoundException {
        try {
            roomDao.deleteRoom(room);
        }
            catch (RoomRecordNotFoundException e) {
           throw new RoomNotFoundException("Room Not Found");
        }
    }


    }

