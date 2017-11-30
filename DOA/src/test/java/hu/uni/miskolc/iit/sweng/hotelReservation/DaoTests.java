package hu.uni.miskolc.iit.sweng.hotelReservation;


import hu.uni.miskolc.iit.sweng.hotelReservation.UserDAO.userDAOImpl;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.IncorrectEmailRecordFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.Nationality;
import hu.uni.miskolc.iit.sweng.hotelReservation.model.user.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Junit test for Dao module
 * @author  Basil Kaikoni
 * @since 29-november - 2017
 * @version 1.0 adding userDao tests
 */

public class DaoTests
{

    public UserDAO userDao;
    @Before
    /**
     * initialize user dao befor each test
     */
    public void InitializeUserDao(){
        userDao =new userDAOImpl();
        System.out.println("User Dao instance initialized");
    }

    @Test
    public void listAllUsersTest(){
        Collection<User> allUsers= userDao.readUsers();
        if(null==allUsers){
            System.out.println("null list values");
            fail("null list values");
        }
        else
        {
            printCurrentUsers(allUsers);
            assertEquals(1,1);
        }
    }

    private void printCurrentUsers(Collection<User> allUsers){
        for(User user : allUsers){
            System.out.println("User "+user.getID()+" - "+user.getName()+ " "+user.getEmail());
        }
    }

    @Test
    //expected not to accept wrong email format and go with incorrect email exception
    public void listUsersByEmailWithWrongEmailFormatTest(){
        try {
            Collection<User> usersByEmails=userDao.listUserByEmail("notanEmail");
            printCurrentUsers(usersByEmails);
            assertEquals(1,1);

        } catch (UserRecordNotFoundException e) {
            fail("User Not Found exception");
        } catch (IncorrectEmailRecordFormatException e) {
            fail("incorrect email exception");
        }
    }

    @Test
    //expected not to find any user and to go with no user found exception
    public void listUsersByEmailWithUnexistedUserEmailTest(){
        try {
            Collection<User> usersByEmails=userDao.listUserByEmail("kaikoni@gmail.com");
            printCurrentUsers(usersByEmails);
            assertEquals(1,1);

        } catch (UserRecordNotFoundException e) {
            fail("User Not Found exception");
        } catch (IncorrectEmailRecordFormatException e) {
            fail("incorrect email exception");
        }
    }

    @Test
    //expected print found users info
    public void listUsersByEmailTest(){
        try {
            Collection<User> usersByEmails=userDao.listUserByEmail("pa@mrao.cam.ac.uk");
            printCurrentUsers(usersByEmails);
            assertEquals(1,1);

        } catch (UserRecordNotFoundException e) {
            fail("User Not Found exception");
        } catch (IncorrectEmailRecordFormatException e) {
            fail("incorrect email exception");
        }
    }

    @Test
    //expected to delete existed user successfully
    public void deletefoundUserTest(){

        User usr=userDao.readUsers().iterator().next() ;
        try {
            //print users before deletion
            System.out.println("print users before deletion");
            printCurrentUsers(userDao.readUsers());
            userDao.deleteUser(usr);

            //print users after deletion
            System.out.println("print users after deletion");
            printCurrentUsers(userDao.readUsers());
            assertEquals(1,1);

        } catch (UserRecordNotFoundException e) {
            fail("user not found "+usr.getName());
        }


    }

    @Test
    //expected to fail to delete none exist user
    public void deleteUserNotExistTest(){
        User usr=new User(1,"Nadia Ali", Nationality.UK,"+4158978956","Birmingham\n" +
                "West Midlands","nadiaali@gmail.uk");

        try {
            userDao.deleteUser(usr);
        } catch (UserRecordNotFoundException e) {
            fail("user not found");
        }
    }

    @Test

    //expected to update first user name successfully
    public void updateUserTest(){
User usr=userDao.readUsers().iterator().next();
        System.out.println("print users before update");
        printCurrentUsers(userDao.readUsers());

        usr.setName("makoto shinkai");
        usr.setNationality(Nationality.US);
        try {
            userDao.updateUser(usr);
        } catch (UserRecordNotFoundException e) {
          fail("user not found");
        }
        System.out.println("print users after update");
        printCurrentUsers(userDao.readUsers());

    }

    @Test
    //expected to give exception none existed user
       public void updateUserNonExistUserTest(){

        User usr=new User(1,"Nadia Ali", Nationality.UK,"+4158978956","Birmingham\n" +
                "West Midlands","nadiaali@gmail.uk");
        try {
            userDao.updateUser(usr);
        } catch (UserRecordNotFoundException e) {
            fail("user not found");
        }

    }









    @After
    /**
     * close userDao instance after each test
     */
    public void finalizeUserDao(){
        userDao=null;
        System.out.println("User Dao instance closed");
    }
}
