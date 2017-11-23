package hu.uni.miskolc.iit.sweng.hotelReservation.UserDAO;


import  hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class userDAOImpl implements UserDAO{
    /**
     * get all users
     *
     * @return
     */
    public Collection<User> readUsers() {
     throw new NotImplementedException();

    }

    /**
     * get users with name
     *
     * @param name
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> readUsersByName(String name) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * get users with specific nationality
     *
     * @param nationality
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> readUsersByNationality(Nationality nationality) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * get user by id
     *
     * @param ID
     * @return user
     * @throws UserRecordNotFoundException
     */
    public User readUsersById(int ID) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * get user by her/his phone number
     *
     * @param phone
     * @return user
     * @throws UserRecordNotFoundException
     */
    public User listUserByPhone(String phone) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * get users by address
     *
     * @param address
     * @return collection of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> listUserByAddress(String address) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * get user by email
     *
     * @param email
     * @return user
     * @throws UserRecordNotFoundException
     */
    public Collection<User> listUserByEmail(String email) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * create new user
     *
     * @param user
     * @return user
     * @throws UserRecordAlreadyExistsException
     */
    public User createUser(User user) throws UserRecordAlreadyExistsException {
        throw new NotImplementedException();
    }

    /**
     * update user info to database
     *
     * @param user
     * @return user
     * @throws UserRecordNotFoundException
     */
    public User updateUser(User user) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }

    /**
     * delete user
     *
     * @param user
     * @throws UserRecordNotFoundException
     */
    public void deleteUser(User user) throws UserRecordNotFoundException {
        throw new NotImplementedException();
    }
}
