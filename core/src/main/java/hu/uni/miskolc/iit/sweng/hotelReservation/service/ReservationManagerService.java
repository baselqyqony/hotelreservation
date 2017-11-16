package hu.uni.miskolc.iit.sweng.hotelReservation.service;

import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.service.PaymentOptions;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.service.Reservation;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.ReservationAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.ReservationNotFoundException;
import java.util.Collection;
import java.util.Date;

public interface ReservationManagerService {


    public Collection<Reservation> listAllReservations();
    public Collection<Reservation> listAllReservationsByID (int ReservationID);
    public Collection<Reservation> listAllReservationsByRooms(Collection<Room> Rooms);
    public Collection<Reservation> listAllReservationsByUser(User user);
    public Collection<Reservation> listAllReservationsByDateIn(Date DateIn);
    public Collection<Reservation> listAllReservationsByDateOut(Date DateOut);
    public Collection<Reservation> listAllReservationsByNumberOfRooms(int NumberOfRooms);
    public Collection<Reservation> listAllReservationsByNumberOfUsers(int NumberOfUsers);
    public Collection<Reservation> listAllReservationsByPaymentOption(PaymentOptions PaymentOption);

    public User createReservation(int ReservationID,
                                  Collection<Room> Rooms,
                                  User user,
                                  Date DateIn,
                                  Date DateOut,
                                  int NumberOfRooms,
                                  int NumberOfUsers,
                                  PaymentOptions PaymentOption) throws ReservationAlreadyExistException;

    public Collection<Reservation> deleteReservation(int ReservationID, Collection<Reservation> Reservations) throws ReservationNotFoundException;

}


