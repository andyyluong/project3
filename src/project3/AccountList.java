package project3;

import java.io.Serializable;
import java.util.ArrayList;

/**
* AccountList class that contains all the login accounts information
* @author andyluong
* @author anthonyPhimmasone
* @author brianJustice
* @author alexLundin
*/
public class AccountList implements Serializable{
  private ArrayList<LoginAccount> accounts;
  
  /**
   * AccountList constructor
   */
  public AccountList(){
    accounts = new ArrayList<>();
  }
  
  /**
   * Add a login account
   * @param account Login account
   */
  public void add(LoginAccount account){
    accounts.add(account);
  }
  
}