package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * WarehouseManager class contains actions for a warehouse manager employee
 * @author andyluong
 */
public class WarehouseManager extends LoginAccount implements Serializable {

    private String warehouseName;
    private Warehouse warehouse;
    private AccountType accountType;
    ArrayList<Inventory> retList;
    
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
     * Get warehouse name
     * @return Warehouse name
     */
    public String getWarehouseName() {
        return warehouseName;
    }
    
    /**
     * Get warehouse
     * @return Warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
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
            
            