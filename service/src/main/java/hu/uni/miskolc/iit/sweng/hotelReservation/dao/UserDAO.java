package hu.uni.miskolc.iit.sweng.hotelReservation.dao;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;

import java.util.Collection;

public interface UserDAO {
    
    Collection<User> readUsers();
    Collection<User> readUsersByName(String name) throws UserRecordNotFoundException;
    Collection<User> readUsersByNationality(Nationality nationality) throws UserRecordNotFoundException;
    User readUsersById(int ID)throws UserRecordNotFoundException;
    User listUserByPhone(String phone) throws UserRecordNotFoundException;
    User listUserByAddress(String address) throws UserRecordNotFoundException;
    Collection<User> listUserByEmail(String email) throws UserRecordNotFoundException;
    User createUser(User user) throws UserRecordAlreadyExistsException;
    User updateUser(User user) throws UserRecordNotFoundException;
    void deleteUser(User user) throws UserRecordNotFoundException;
}
