package hu.uni.miskolc.iit.sweng.hotelReservation.dao;

import hu.uni.miskolc.iit.sweng.hotelReservation.model.room.Room;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.service.PaymentOptions;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.service.Reservation;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.ReservationAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.ReservationNotFoundException;
import java.util.Collection;
import java.util.Date;

public interface ReservationDAO {

    Collection<Reservation> readReservation();
    Collection<Reservation> readReservationByID (int ReservationID);
    Collection<Reservation> readReservationByRooms(Collection<Room> Rooms);
    Collection<Reservation> readReservationByUser(User user);
    Collection<Reservation> readReservationByDateIn(Date DateIn);
    Collection<Reservation> readReservationByDateOut(Date DateOut);

    void addReservation(Reservation reservation) throws ReservationAlreadyExistException;
    void updateReservation(Reservation reservation) throws ReservationNotFoundException;
    void deleteReservation(Reservation reservation) throws ReservationNotFoundException;
}


