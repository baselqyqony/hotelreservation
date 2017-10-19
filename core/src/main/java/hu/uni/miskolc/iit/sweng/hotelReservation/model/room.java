package hu.uni.miskolc.iit.sweng.hotelReservation.model;

/**
 * Created by Ahmad Reda on 2017.10.19..
 */
public class room {
    private int number;
    private  RoomType type;
    private int capacity;

    public room(int number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

