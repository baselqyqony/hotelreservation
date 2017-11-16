package hu.uni.miskolc.iit.sweng.hotelReservation.service;


import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;

import java.util.Collection;

public interface ReservationManagerService {


    public Collection<User> listAllUsers();

    public Collection<Room> listAllrooms();

    //commenttttgnn

}


