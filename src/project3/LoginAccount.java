package project3;

public class LoginAccount {

    public Person person;
    public String userName;
    public String password;

    public LoginAccount(Person person, String userName, String password) {
        this.person = person;
        this.userName = userName;
        this.password = password;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //Getters & Setters

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() { return person + " " + userName + " " + password; }
}
