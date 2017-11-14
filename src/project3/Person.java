package project3;

import java.io.Serializable;

/**
 *
 * Person class defines a person 
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 */
public class Person implements Serializable {
    
    /**
     * Data members
     */
    public String firstName;
    public String lastName;
    public int age;
    public int phoneNumber;
    public String emailAddress;

    /**
     * Person constructor
     * @param firstName First name of a person
     * @param lastName Last name of a person
     * @param age Age of a person
     * @param phoneNumber Phone number of a person
     * @param aEmailAddress Email address of a person
     */
    public Person(String firstName, String lastName, int age, int phoneNumber,
           String aEmailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = aEmailAddress;
    }
     
    //-----------------------------------------------------------------------------------------------------------------
    //Getters & Setters

    /**
     * Get first name of a person
     * @return First name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name of a person
     * @param firstName First name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name of a person
     * @return Last name of a person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name of a person
     * @param lastName Last name of a person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the age of a person
     * @return Age of a person
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of a person
     * @param age Age of a person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the phone number of a person
     * @return Phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the phone number of a person
     * @param phoneNumber Phone number of a person
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Set the email address of a person
     * @param emailAddress Email address of a person
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * toString Displays person attributes in a string
     * @return First name, last name, age, phone number, and email address
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + phoneNumber + " " + emailAddress;
    }
}