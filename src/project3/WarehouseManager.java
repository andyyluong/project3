package project3;

import java.io.Serializable;
/**
 * Warehouse Manager class contains actions for a warehouse manager employee
 * @author andyluong
 */
public class WarehouseManager extends LoginAccount implements Serializable {

    private AccountType accountType;
    
    /**
     * Warehouse Manager constructor
     * @param p Person that is a warehouse manager
     * @param aUserName Username of a warehouse manager
     * @param aPassword Password of a warehouse manager
     */
    public WarehouseManager(Person p, String aUserName, String aPassword) {
        super(p, aUserName, aPassword);
        accountType = AccountType.WAREHOUSE_MANAGER;
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