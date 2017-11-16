package hu.uni.miskolc.iit.sweng.hotelReservation.model;
import java.math.BigDecimal;
/**
 * Created by Ahmad Reda on 2017.10.19..
 */
public class Room {
    private int number;
    private  RoomType type;
    private int capacity;
    private Price price;



    public Room(int number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.price=new Price(type.Price());
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

    public BigDecimal getPrice() {return this.price.getAmount();}

    public void setCurrencyType(CurrencyType ct) {this.price.setCurrencyType(ct);}

    public void setPrice(BigDecimal price){this.price.setAmount(price);}

}

