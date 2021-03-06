package hu.uni.miskolc.iit.sweng.hotelReservation.userService;


import hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.IncorrectEmailRecordFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.UserManagerService;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.IncorrectEmailFormatException;
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
        } catch (UserRecordNotFoundException e) {
            throw new UserNotFoundException("no user found");
        }

    }

    public User listUserByID(int ID) throws UserNotFoundException {

        try {
            return userDao.readUsersById(ID);
        } catch (UserRecordNotFoundException e) {
            throw new UserNotFoundException("user not found");
        }

    }

    public Collection<User> listUserByNationality(Nationality nationality)  throws UserNotFoundException {
        try {
            return userDao.readUsersByNationality(nationality);
        } catch (UserRecordNotFoundException e) {
           throw new UserNotFoundException("no user found");
        }
    }

    public User listUserByPhone(String phone) throws UserNotFoundException {
        try {
            return userDao.listUserByPhone(phone);
        } catch (Exception e) {
           throw new UserNotFoundException("user not found");
        }
    }

    public Collection<User> listUserByAddress(String address) throws UserNotFoundException {
        try {
            return userDao.listUserByAddress(address);
        } catch (UserRecordNotFoundException e) {
            throw new UserNotFoundException("user not found");
        }
    }

    public Collection<User> listUserByEmail(String email) throws UserNotFoundException,IncorrectEmailFormatException {
        try {
            return userDao.listUserByEmail(email);
        } catch (UserRecordNotFoundException e) {
          throw new UserNotFoundException("user not found");
        } catch (IncorrectEmailRecordFormatException e) {
            throw new IncorrectEmailFormatException("incorrect Email");
        }
    }

    public User createUser(int ID, String name, Nationality nationality, String phone, String address, String Email)
            throws UserAlreadyExistException,IncorrectEmailFormatException
   {
        User user =new User( ID, name,  nationality,  phone,  address, Email);

        try {
            return userDao.createUser(user);
        } catch (UserRecordAlreadyExistsException e) {
            throw new UserAlreadyExistException("user already exists");
        } catch (IncorrectEmailRecordFormatException e) {

         throw new IncorrectEmailFormatException("incorrect email format");
        }


    }

    public void deleteUser(User user) throws UserNotFoundException {
        try {
            userDao.deleteUser(user);
        } catch (UserRecordNotFoundException e) {
            throw new UserNotFoundException("no user found");
        }
    }

    public boolean updateUser(User user) throws UserNotFoundException,IncorrectEmailFormatException {

        try {
            return userDao.updateUser(user);
        } catch (UserRecordNotFoundException e) {
            throw new UserNotFoundException("user not found");
        } catch (IncorrectEmailRecordFormatException e) {
           throw new IncorrectEmailFormatException("incorrect email format");
        }

    }
}
