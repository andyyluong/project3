package project3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * AccountList class that contains all the login accounts information
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class AccountList implements Serializable{
    
    /**
     * Data members
     */
    private ArrayList<LoginAccount> accounts;
    private ArrayList<SalesAssociate> salesAssociates;
    private OfficeManager officeManager;
    private SystemAdministrator systemAdministrator;
    private WarehouseManager warehouseManager;
    private static AccountList accountList = new AccountList();
    
    /**
     * AccountList constructor
     */
    private AccountList(){
        accounts = new ArrayList<>();
        salesAssociates = new ArrayList<>();
    }

    /**
     * Add a login account
     * @param account Login account
     */
    public void add(LoginAccount account){
        if(account.getType()==AccountType.SALES_ASSOCIATE){
            salesAssociates.add((SalesAssociate) account);
        } 
        if(account.getType()==AccountType.OFFICE_MANAGER){
            officeManager = (OfficeManager) account;
        }
        if(account.getType()==AccountType.ADMIN){
            systemAdministrator = (SystemAdministrator) account;
        }
        if(account.getType()==AccountType.WAREHOUSE_MANAGER){
            warehouseManager = (WarehouseManager) account;
        }
        accounts.add(account);
    }

    /**
     * Delete employee login account
     * @param username Username of login account
     */
    public void delete(String username){
        LoginAccount account = null;
        for(LoginAccount la: accounts){
            if(la.getUserName().equals(username)){
                account = la;
            }
        }
        if(account.getType()==AccountType.SALES_ASSOCIATE){
            salesAssociates.remove((SalesAssociate) account);
        }
        if(account.getType()==AccountType.OFFICE_MANAGER){
            officeManager = null;
        }
        if(account.getType()==AccountType.ADMIN){
            systemAdministrator = null;
        }
        if(account.getType()==AccountType.WAREHOUSE_MANAGER){
            warehouseManager = null;
        }
        accounts.remove(account);
    }
    
    /**
     * Get login accounts
     * @return list of login accounts
     */
    public ArrayList<LoginAccount> getAccounts(){
        return accounts;
    }
    
    /**
     * Get sales associate
     * @param name Sales associate name
     * @return Sales associate by name
     */
    public SalesAssociate getSalesAssociate(String name){
        SalesAssociate salesAssociate = null;
        for(SalesAssociate sa: salesAssociates){
            if(sa.getUserName().equals(name)){
                salesAssociate = sa;
            }
        }
        return salesAssociate;
    }
    
    /**
     * Get other employee accounts by name
     * @param username Username of employee account
     * @return Employee account that matches the name
     */
    public LoginAccount getOtherAccountByName(String username){
        if(systemAdministrator.getUserName().equals(username)){
            return systemAdministrator;
        }
        if(officeManager.getUserName().equals(username)){
            return officeManager;
        }
        return warehouseManager;
    }
   
    /**
     * Get an account list object
     * @return Instance of account list
     */
    public static AccountList getObject(){
        return accountList;
    }
}