package hu.uni.miskolc.iit.sweng.hotelReservation.model.room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.CurrencyType;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.Price;

import java.math.BigDecimal;
/**
 * Created by Ahmad Reda on 2017.10.19..
 */
public class Room {
    private int number;
    private  RoomType type;
    private int capacity;
    private Price price;


    /**
     * room constructor with initial room price
     * @param number room number
     * @param type  room type
     * @param capacity bed number
     */
    public Room(int number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.price=new Price(type.Price());
    }

    /**
     * get room number
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * set room number
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * get room type
     * @return
     */
    public RoomType getType() {
        return type;
    }

    /**
     * set room type
     * @param type
     */
    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     * set room capacity
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * get room capacity
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * get room price
     * @return
     */
    public BigDecimal getPrice() {return this.price.getAmount();}

    /**
     * set price currency Type
     * @param ct
     */
    public void setCurrencyType(CurrencyType ct) {this.price.setCurrencyType(ct);}

    /**
     * set room price
     * @param price
     */
    public void setPrice(BigDecimal price){this.price.setAmount(price);}

}

