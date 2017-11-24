package hu.uni.miskolc.iit.sweng.hotelReservation.dao;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.IncorrectEmailFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;

import java.util.Collection;

public interface UserDAO {

    /**
     * get all users
     * @return
     */
    Collection<User> readUsers();

    /**
     * get users with name
     * @param name
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    Collection<User> readUsersByName(String name) throws UserRecordNotFoundException;

    /**
     * get users with specific nationality
     * @param nationality
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    Collection<User> readUsersByNationality(Nationality nationality) throws UserRecordNotFoundException;

    /**
     * get user by id
     * @param ID
     * @return user
     * @throws UserRecordNotFoundException
     */
    User readUsersById(int ID)throws UserRecordNotFoundException;

    /**
     * get user by her/his phone number
     * @param phone
     * @return user
     * @throws UserRecordNotFoundException
     */
    User listUserByPhone(String phone) throws UserRecordNotFoundException;

    /**
     * get users by address
     * @param address
     * @return collection of users
     * @throws UserRecordNotFoundException
     */
    Collection<User> listUserByAddress(String address) throws UserRecordNotFoundException;

    /**
     * get user by email
     * @param email
     * @return user
     * @throws UserRecordNotFoundException
     */
    Collection<User> listUserByEmail(String email) throws UserRecordNotFoundException,IncorrectEmailFormatException;

    /**
     * create new user
     * @param user
     * @return user
     * @throws UserRecordAlreadyExistsException
     */
    User createUser(User user) throws UserRecordAlreadyExistsException;

    /**
     * update user info to database
     * @param user
     * @return user
     * @throws UserRecordNotFoundException
     */
    User updateUser(User user) throws UserRecordNotFoundException;

    /**
     * delete user
     * @param user
     * @throws UserRecordNotFoundException
     */
    void deleteUser(User user) throws UserRecordNotFoundException;
}
