/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author andyluong
 */
public class Person {
    
    public String firstName;
    public String lastName;
    public int age;
    public int phoneNumber;
    public String emailAddress;
    
    Person(String aFirstName, String aLastName, int aAge, int aPhoneNumber,
            String aEmailAddress) {
        firstName = aFirstName;
        lastName = aLastName;
        age = aAge;
        phoneNumber = aPhoneNumber;
        emailAddress = aEmailAddress;
        
    }
    
    public void setFirstName(String aFirstName) {
       firstName = aFirstName;
    }
    
    public String getFirstName() {
       return firstName;
    }
    
    public void setLastName(String aLastName) {
        lastName = aLastName;
    } 
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAge(int aAge) {
        age = aAge;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setPhoneNumber(int aPhoneNumber) {
        phoneNumber = aPhoneNumber;         
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    

}
