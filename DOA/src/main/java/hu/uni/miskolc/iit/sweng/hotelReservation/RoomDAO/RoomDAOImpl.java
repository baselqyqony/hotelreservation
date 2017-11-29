package hu.uni.miskolc.iit.sweng.hotelReservation.RoomDAO;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.RoomDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.RoomRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.RoomType;

import java.util.*;

/**
 * RoomDAO Implementation
 * @auther Ahmad Reda
 * @since 29.11.2017
 * @version 1.1 implementing functions
 */

public class RoomDAOImpl implements RoomDAO {
    private static Collection<Room> database;

    /**
     * Set up a predefined Database
     */
    static {
        database = new ArrayList<Room>(Arrays.asList(
                new Room(1, RoomType.Normal, 1),
                new Room(2, RoomType.Normal, 2),
                new Room(2, RoomType.Normal, 3),
                new Room(2, RoomType.sweet, 1),
                new Room(2, RoomType.sweet, 2),
                new Room(2, RoomType.sweet, 3)

        ));
    }

    /**
     * Get all rooms
     * @return Collection of rooms
     */
    public Collection<Room> readRoom() { return new HashSet<Room>(database); }

    /**
     *
     * @param number
     * @return room
     * @throws RoomRecordNotFoundException
     */

    public Room readRoomByNumber(int number) throws RoomRecordNotFoundException {
     Room result= null;
        for (Room room:database) {
            if (room.getNumber() == number) {
                result = room;
            }
        }
            if(result!=null) {
                return  result;
            }
            else {  throw new RoomRecordNotFoundException("Room Not Found");
            }

    }
    /**
     * @param type
     * @return Collection of rooms
     * @throws RoomRecordNotFoundException
     */
    public Collection<Room> readRoomByType(RoomType type) throws RoomRecordNotFoundException {
        Collection<Room>result=new HashSet<Room>();
        for (Room room:database) {
            if (room.getType().equals(type)){
                result.add(room);
            }
        }

        if (result.isEmpty()){
            throw new RoomRecordNotFoundException("Room Not Found");
        }
        else {
            return result;
        }

        }
    /**
     * @param capacity
     * @return Collection of rooms
     * @throws RoomRecordNotFoundException
     */
    public Collection<Room> readRoomByCapacities(int capacity) throws RoomRecordNotFoundException {
        Collection<Room> result = new HashSet<Room>();
        for (Room room : database) {
            if (room.getCapacity() == capacity) {
                result.add(room);
            }
        }
        if (result.isEmpty()) {
            throw new RoomRecordNotFoundException("Room Not Found");
        } else {
            return result;
        }
    }






        /**
         * @param room
         * @return room
         * @throws RoomRecordAlreadyExistException
         */
    public Room createRoom(Room room) throws RoomRecordAlreadyExistException {
  for (Room record:database){
      if (record==null){
          continue;
      }
if (record.equals(room)){
          throw new RoomRecordAlreadyExistException("Room of number"+record.getNumber()+"Type"+record.getType()+"Capacity"+record.getCapacity()+"is already exist");
      }

  }

     database.add(room);
        return room;
    }

    /**
     * @param room
     * @return boolean value indicate to that if the update process success or not.
     * @throws RoomRecordNotFoundException
     */
    public boolean updateRoom(Room room) throws RoomRecordNotFoundException {
        boolean roomExist=false;
        for (Room record : database) {
            if (record.getNumber() == room.getNumber()) {
                record.setType(room.getType());
                record.setCapacity(room.getCapacity());
                roomExist=true;
            }
            if (record.getNumber()!= room.getNumber()){
              throw new RoomRecordNotFoundException("Room Not Found");
            }

        }
        return roomExist;
    }



    /**
     * @param room
     * @return boolean value indicate to that if the delete process success or not.
     * @throws RoomRecordNotFoundException
     */
   public boolean deleteRoom(Room room) throws RoomRecordNotFoundException {
       boolean roomExist=false;
       for (Room record : database) {
           if (record.getNumber() == room.getNumber()){
           database.remove(room);
           roomExist=true;
           }
           if (record.getNumber()!= room.getNumber()){
               throw new RoomRecordNotFoundException("Room Not Found");
           }
              }

       return roomExist;
   }
}

