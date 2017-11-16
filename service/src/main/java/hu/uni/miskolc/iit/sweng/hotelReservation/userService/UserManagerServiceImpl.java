package hu.uni.miskolc.iit.sweng.hotelReservation.userService;

import hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.UserManagerService;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserNotFoundException;


import java.util.Collection;


/**
 * @author Basil Kaikoni 16 November 2017
 * @version 1.0
 */
public class UserManagerServiceImpl implements UserManagerService {
    /**
     * user data access object
     */
    private UserDAO userDao;

    public UserManagerServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }


    public Collection<User> listAllUsers() {
        return userDao.readUsers() ;
    }

    public Collection<User> listUserByName(String Name) throws UserNotFoundException {
        try {
            return userDao.readUsersByName(Name);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User listUserByID(int ID) throws UserNotFoundException {
        try {
            return userDao.readUsersById(ID);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Collection<User> listUserByNationality(Nationality nationality) {
        try {
            return userDao.readUsersByNationality(nationality);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User listUserByPhone(String phone) throws UserNotFoundException {
        try {
            return userDao.listUserByPhone(phone);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User listUserByAddress(String address) throws UserNotFoundException {
        try {
            return userDao.listUserByAddress(address);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Collection<User> listUserByEmail(String email) {
        try {
            return userDao.listUserByEmail(email);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User createUser(int ID, String name, Nationality nationality, String phone, String address, String Email) throws UserAlreadyExistException {
        User user =new User( ID, name,  nationality,  phone,  address, Email);
        try {
            return userDao.createUser(user);
        } catch (UserAlreadyExistsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteUser(User user) throws UserNotFoundException {
        try {
            userDao.deleteUser(user);
        } catch (hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
