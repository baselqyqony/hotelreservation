package hu.uni.miskolc.iit.sweng.hotelReservation.model;

/**
 * hold room data
 * @author Ahmad Reda
 *@version 1.0
 * @since 09 - 11 - 2017
 *
 */
public class Room {
    /**
     * room number
     */
    private int number;
    /**
     * room type
     */
    private  RoomType type;
    /**
     * room capacity(number of beds);
     */
    private int capacity;

    /**
     * Room class constructor
     * @param number room number
     * @param type room type
     * @param capacity capacity of room
     */
    public Room(int number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    /**
     *
     *
     * @return int  This returns room number
     */
    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return RoomType
     */
    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     *
     * @return int this returns the capacity of room
     */
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

