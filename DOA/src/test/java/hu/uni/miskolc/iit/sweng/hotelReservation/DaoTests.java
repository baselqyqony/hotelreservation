package hu.uni.miskolc.iit.sweng.hotelReservation;


import hu.uni.miskolc.iit.sweng.hotelReservation.UserDAO.userDAOImpl;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.UserDAO;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.IncorrectEmailRecordFormatException;
import hu.uni.miskolc.iit.sweng.hotelReservation.dao.exception.UserRecordNotFoundException;
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


    @After
    /**
     * close userDao instance after each test
     */
    public void finalizeUserDao(){
        userDao=null;
        System.out.println("User Dao instance closed");
    }
}
