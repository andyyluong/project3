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
    private ArrayList<SalesAssociate> salesAssociates;
    private OfficeManager officeManager;
    private SystemAdministrator systemAdministrator;
    private WarehouseManager warehouseManager;
    /**
     * AccountList constructor
     */
    public AccountList(){
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

    public void delete(LoginAccount account){
        if(account.getType()==AccountType.SALES_ASSOCIATE){
            salesAssociates.remove((SalesAssociate) account);
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
        accounts.remove(account);
    }
    
    //Make into an Iterator Pattern
    public ArrayList<LoginAccount> getAccounts(){
        return accounts;
    }
}
