package hu.uni.miskolc.iit.sweng.hotelReservation.dao;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.User;

import java.util.Collection;

public interface UserDAO {
    Collection<User> readUsers();
    Collection<User> readUsersByName(String name);
    Collection<User> readUsersByNationality(Nationality nationality);
    void addUser(User) throws UserAlreadyExistsException;
    void updateUser(User user) throws UserNotFoundException;
    void deleteUser(User user) throws UserNotFoundException;
}
