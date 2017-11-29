package hu.uni.miskolc.iit.sweng.hotelReservation.service;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.IncorrectEmailFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserNotFoundException;

import java.util.Collection;


/*
Created By Basil Kaikoni 26-10-2017
 */
public interface UserManagerService {
    public Collection<User> listAllUsers() ;
    public Collection<User> listUserByName(String Name) throws UserNotFoundException;
    public User listUserByID (int ID) throws UserNotFoundException;
    public Collection<User> listUserByNationality (Nationality nationality) throws UserNotFoundException;
    public User listUserByPhone(String phone) throws UserNotFoundException;
    public Collection<User> listUserByAddress(String address) throws UserNotFoundException;
    public Collection<User> listUserByEmail (String email) throws UserNotFoundException, IncorrectEmailFormatException;

    public User createUser(int ID ,String name,
             Nationality nationality,
             String phone,
             String address,
             String Email) throws UserAlreadyExistException;

    public void deleteUser(User user) throws UserNotFoundException;
  //  public void editUser(User user ) ;
}
