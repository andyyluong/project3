/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;
import java.io.Serializable;
/**
 * LoginAccount class contains the information of a login account
 * @author andyluong
 */
public class LoginAccount implements Serializable{
    
    /**
     * Data members
     */
    public String userName;
    public String password;
    public Person person;
    
    /**
     * LoginAccount constructor
     * @param aPerson Person's information
     * @param aUserName Person's username
     * @param aPassword Person's password
     */
    public LoginAccount(Person aPerson, String aUserName, String aPassword) {
        person = aPerson;
        userName = aUserName;
        password = aPassword;
        
    }
    
    /**
     * Method that sets a person
     * @param aPerson Person 
     */
    public void setPerson(Person aPerson) {
        person = aPerson;
    }
    
    /**
     * Method that gets a person
     * @return A person
     */
    public Person getPerson() {
        return person;
    }
    
    /**
     * Method that sets a username for a person
     * @param aUserName Username of a person
     */
    public void setUserName(String aUserName) {
        userName = aUserName;
    }
    
    /**
     * Method that gets a username
     * @return Username of a person
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Method that sets a password
     * @param aPassword password of a person
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }
    
    /**
     * Method that gets a password
     * @return Password of a person
     */
    public String getPassword() {
        return password;
    }
    
}
