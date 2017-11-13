package project3;
import java.io.Serializable
/**
 *
 * Person class defines a person 
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 */

public class Person implements Serializable{

    public String firstName;
    public String lastName;
    public int age;
    public int phoneNumber;
    public String emailAddress;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * method toString
     * @return firstName
     * @return lastName
     * @return age
     * @return phoneNumber
     * @return emailAddress
     *
     */
    public String toString() {return firstName + " " + lastName + " " + age + " " + phoneNumber + " " + emailAddress;}
}
