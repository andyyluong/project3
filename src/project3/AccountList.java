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
  private ArrayList<LoginAccount> salesAssociates;
  
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
    if(account.getType()==AccountType.SALES_ASSOCIATE){
      salesAssociates.add(account);
    }
    accounts.add(account);
  }
  
}
