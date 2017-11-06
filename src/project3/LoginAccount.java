/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class LoginAccount {
    
    public String userName;
    public String password;
    public Person person;
    
    public LoginAccount(Person aPerson, String aUserName, String aPassword) {
        person = aPerson;
        userName = aUserName;
        password = aPassword;
        
    }
    
    public void setPerson(Person aPerson) {
        person = aPerson;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setUserName(String aUserName) {
        userName = aUserName;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setPassword(String aPassword) {
        password = aPassword;
    }
    
    public String getPassword() {
        return password;
    }
    
    
}
