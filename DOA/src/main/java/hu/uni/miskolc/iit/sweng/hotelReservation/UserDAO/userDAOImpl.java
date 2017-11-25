package hu.uni.miskolc.iit.sweng.hotelReservation.UserDAO;


import  hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.IncorrectEmailFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordAlreadyExistsException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * userDao Implementation
 * @author  Basil Kaikoni
 * @since 23 November 2017
 * @version 1.1 implementing functions
 * @version 1.2 implements updateUser and deleteUser functions
 */
public class userDAOImpl implements UserDAO{

    private static Collection<User> users;

    static {

        users=new ArrayList<User>(Arrays.asList(
           new User(1,"Basil Kaikoni", Nationality.SY,"+36702505551","Miskolc Hungary egyetemváros", "baselqyqony@gmail.com"),
           new User(2,"Stella Kowalski", Nationality.IT,"+32226871078","Modena MO, Italy", "StellaKowalski@gmail.com"),
           new User(3,"Alexander Paul", Nationality.US,"+14155552671","1621 Polk St, San Francisco, CA 94109, USA", "pa@mrao.cam.ac.uk"),
           new User(4,"Tyler Lee", Nationality.UK,"+442077734567","20 Brewer St, Soho, London W1F 0SJ, UK", "tylerlee@gmail.com"),
           new User(5,"Áron Farkas", Nationality.HU,"+36987487498","Miskolc, Meggyesalja u. 18, 3530", "aronfarkas@gmail.com"),
           new User(6,"Fekete István", Nationality.HU,"+36482519991","Baja, Kossuth Lajos u. 1, 6500", "feketeistva n@yahoo.hu")

        ));
    }
    /**
     * get all users
     *
     * @return list of users
     */
    public Collection<User> readUsers() {
     return new HashSet<User>(users);
    }

    /**
     * get users with name
     *
     * @param name
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> readUsersByName(String name) throws UserRecordNotFoundException {
        Collection<User> result=new HashSet<User>();
        for(User user:users){
            if(user.getName().toUpperCase().contains(name.toUpperCase())){
                result.add(user);
            }
        }
        if(result.size()>0) {
            return result;
        }
        else {
            throw new UserRecordNotFoundException("user not found");
        }
    }

    /**
     * get users with specific nationality
     *
     * @param nationality
     * @return list of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> readUsersByNationality(Nationality nationality) throws UserRecordNotFoundException {
       Collection<User> result=new HashSet<User>();
       for(User user:users){
           if(user.getNationality().equals(nationality)){
               result.add(user);
           }
       }
        if(result.size()>0) {
            return result;
        }
        else {
            throw new UserRecordNotFoundException("user not found");
        }
    }

    /**
     * get user by id
     *
     * @param ID
     * @return user
     * @throws UserRecordNotFoundException
     */
    public User readUsersById(int ID) throws UserRecordNotFoundException {
        User result=null;
        for(User user:users){
            if(user.getID()==ID){
                result=user;
            }
        }
        if(null!=result) {
            return  result;
        }
        else {
            throw new UserRecordNotFoundException("user not found");
        }
    }

    /**
     * get user by her/his phone number
     *
     * @param phone
     * @return user
     * @throws UserRecordNotFoundException
     */
    public User listUserByPhone(String phone) throws UserRecordNotFoundException {
        User result=null;
        for(User user:users){
            if(user.getPhone().toUpperCase().equals(phone.toUpperCase())){
                result=user;
            }
        }
        if(null!=result) {
            return  result;
        }
        else {
            throw new UserRecordNotFoundException("user not found");
        }
    }

    /**
     * get users by address
     *
     * @param address
     * @return collection of users
     * @throws UserRecordNotFoundException
     */
    public Collection<User> listUserByAddress(String address) throws UserRecordNotFoundException {
        Collection<User> result=new HashSet<User>();
        for(User user:users){
            if(user.getAddress().toUpperCase().contains(address.toUpperCase())){
                result.add(user);
            }
        }
        if(result.size()>0) {
            return result;
        }
        else {
            throw new UserRecordNotFoundException("user not found");
        }
    }

    /**
     * get user by email
     *  any part of email is accepted that's why it may return list
     * @param email
     * @return user
     * @throws UserRecordNotFoundException
     */
    public Collection<User> listUserByEmail(String email) throws UserRecordNotFoundException,IncorrectEmailFormatException {
        //check Email format validity
         final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
         Matcher checker=VALID_EMAIL_ADDRESS_REGEX.matcher(email);
         if(!checker.find())
        {
            throw new IncorrectEmailFormatException("incorrect email format !");
        }
        else {
             Collection<User> result = new HashSet<User>();
             for (User user : users) {
                 if (user.getEmail().toUpperCase().contains(email.toUpperCase())) {
                     result.add(user);
                 }
             }
             if (result.size() > 0) {
                 return result;
             } else {
                 throw new UserRecordNotFoundException("user not found");
             }
         }
    }

    /**
     * create new user
     *
     * @param user
     * @return user
     * @throws UserRecordAlreadyExistsException
     */
    public User createUser(User user) throws UserRecordAlreadyExistsException {
        for(User record:users)
        {
            if(null==record){
                continue;
            }
            if(record==user){
                throw new UserRecordAlreadyExistsException("user with id"+record.getID()+" and name "+ record.getName()+"is already exists !");
            }

        }
        users.add(user);
        return user;

    }

    /**
     * update user info to database
     *
     * @param user
     * @return process result update success of fail
     * @throws UserRecordNotFoundException
     */
    public boolean updateUser(User user) throws UserRecordNotFoundException {
        boolean userFound=true;

        for(User record:users)
        {
           if(record.getID()==user.getID()){
               record.setAddress(user.getEmail());
               record.setName(user.getName());
               record.setNationality(user.getNationality());
               record.setPhone(user.getPhone());

               userFound=true;
               break;
           }

        }
        if(! userFound){
            throw new UserRecordNotFoundException("no user found");
        }

        return userFound;

    }



    /**
     * delete user
     * @param user
     * @return result of delete process success or fail
     * @throws UserRecordNotFoundException
     */
    public boolean deleteUser(User user) throws UserRecordNotFoundException {
        boolean userFound=true;

        for(User record:users)
        {
            if(record.getID()==user.getID()){

               users.remove(user);
                userFound=true;
                break;
            }

        }
        if(! userFound){
            throw new UserRecordNotFoundException("no user found");
        }

        return userFound;

    }
}
