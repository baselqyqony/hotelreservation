package hu.uni.miskolc.iit.sweng.hotelReservation.model;

/**
 * Create Class Room for Room Information
 * @author Ahmad Reda
 *@version 1.0
 * @since 09 - 11 - 2017
 *
 */
public class Room {
    /**
     * number of the room
     */
    private int number;
    /**
     * type of the room
     */
    private  RoomType type;
    /**
     *capacity of the room(number of beds).
     */
    private int capacity;

    /**
     * this is the constructor to initialize room object.
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
     * To get room number.
     * @return  room number
     */
    public int getNumber() {
        return number;
    }

    /**
     * To set number of the room.
     * @param number new room number.
     */

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *To get room type
     * @return room type
     */
    public RoomType getType() {
        return type;
    }

    /**
     * To set room type
     * @param type type of the room
     */

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

    /**
     * To set Room Capacity
     * @param capacity room capacity
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

