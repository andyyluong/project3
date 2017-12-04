package project3;

import person.Person;

/**
 * Office Manager class defines the actions for a office manager employee
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class OfficeManager extends LoginAccount {

    /**
     * Data member
     */
    private AccountType accountType;
    
    /**
     * 
     * @param p Person that is a office manager
     * @param aUserName Username of office manager
     * @param aPassword Password of office manager
     */
    public OfficeManager(Person p, String aUserName, String aPassword) {
        super(p, aUserName, aPassword);
        accountType = AccountType.OFFICE_MANAGER;
    }
  
    /**
     * Get account type
     * @return Account type
     */
    @Override
    public AccountType getType() {
        return accountType;
    }
    
}