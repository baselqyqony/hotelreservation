package hu.uni.miskolc.iit.sweng.hotelReservation.service;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserAlreadyExistException;
import hu.uni.miskolc.iit.sweng.hotelReservation.service.exceptions.UserNotFoundException;

import java.util.Collection;


/*
Created By Basil Kaikoni 26-10-2017
 */
public interface UserManagerService {
    public Collection<User> listAllUsers();
    public Collection<User> listUserByName(String Name);
    public Collection<User> listUserByID (int ID);
    public Collection<User> listUserByNationality (Nationality nationality);
    public Collection<User> listUserByPhone(String phone);
    public Collection<User> listUserByAddress(String address);
    public Collection<User> listUserByEmail (String email);
    public User createUser(  String name,
             Nationality nationality,
             String phone,
             String address,
             String Email) throws UserAlreadyExistException;

    public Collection<User> deleteUser(int ID, Collection<User> users) throws UserNotFoundException;
  //  public void editUser(User user ) ;
}
