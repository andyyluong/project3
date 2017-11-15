package project3;

/**
 * Office Manager class contains actions for office manager employee
 * @author andyluong
 */
public class OfficeManager extends LoginAccount {

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