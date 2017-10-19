package hu.uni.miskolc.iit.sweng.hotelReservation.model;

public class RoomPrice {
    private RoomType room_type;
    private int room_capacity;
    private double service_price;

    public RoomPrice(RoomType room_type, int room_capacity, double service_price) {
        this.room_type = room_type;
        this.room_capacity = room_capacity;
        this.service_price = service_price;
    }

    public RoomType getRoom_type() {
        return room_type;
    }

    public void setRoom_type(RoomType room_type) {
        this.room_type = room_type;
    }

    public int getRoom_capacity() {
        return room_capacity;
    }

    public void setRoom_capacity(int room_capacity) {
        this.room_capacity = room_capacity;
    }

    public double getService_price() {
        return service_price;
    }

    public void setService_price(double service_price) {
        this.service_price = service_price;
    }
}
