package project3;

/**
 * System Administrator class contains actions for system administrator employee
 * @author andyluong
 */
public class SystemAdministrator extends LoginAccount {

    private AccountType accountType;
    
    /**
     * System Administrator constructor
     * @param p Person that is a system administrator
     * @param aUserName Username of system administrator
     * @param aPassword Password of system administrator
     */
    public SystemAdministrator(Person p, String aUserName, String aPassword) {
        super(p, aUserName, aPassword);
        accountType = AccountType.ADMIN;
    }

    /**
     * Get account type
     * @return System administrator account type
     */
    @Override
    public AccountType getType() {
        return accountType;
    }
    
}