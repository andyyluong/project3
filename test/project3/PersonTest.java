package project3;

import org.junit.Test;
import static org.junit.Assert.*;
import person.Person;

/**
 * PersonTest contains the Person class for JUnit test
 * @author andyluong
 */
public class PersonTest {

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("Get First Name");
        Person instance = new Person();
        String expResult = "Andy";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("Get Last Name");
        Person instance = new Person();
        String expResult = "Luong";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmailAddress method, of class Person.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("Get Email Address");
        Person instance = new Person();
        String expResult = "Andy@bikepart.com";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);

    }
    
}
