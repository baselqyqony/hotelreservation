package hu.uni.miskolc.iit.sweng.hotelReservation.model.service;

import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.*;

import java.util.Collection;
import java.util.Date;

public class Reservation {

    private Collection<Room> Rooms;
    private User user;
    private Date DateIn;
    private Date DateOut;
    private int NumberOfRooms;
    private int NumberOfUsers;
    private PaymentOptions PaymentOption;

    public Reservation(Collection<Room> rooms, User user, Date dateIn, Date dateOut, int numberOfRooms, int numberOfUsers, PaymentOptions paymentOption) {
        Rooms = rooms;
        this.user = user;
        DateIn = dateIn;
        DateOut = dateOut;
        NumberOfRooms = numberOfRooms;
        NumberOfUsers = numberOfUsers;
        PaymentOption = paymentOption;
    }

    public Collection<Room> getRooms() {
        return Rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        Rooms = rooms;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date dateIn) {
        DateIn = dateIn;
    }

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date dateOut) {
        DateOut = dateOut;
    }

    public int getNumberOfRooms() {
        return NumberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        NumberOfRooms = numberOfRooms;
    }

    public int getNumberOfUsers() {
        return NumberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        NumberOfUsers = numberOfUsers;
    }

    public PaymentOptions getPaymentOption() {
        return PaymentOption;
    }

    public void setPaymentOption(PaymentOptions paymentOption) {
        PaymentOption = paymentOption;
    }
}
