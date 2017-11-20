package project3;

import java.io.Serializable;
/**
 * Sales Associate class defines the actions of a sales associate employee
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class SalesAssociate extends LoginAccount implements Serializable {
    private String WarehouseName;
    private Warehouse warehouse;
    private AccountType accountType;
    private SalesVanWarehouse salesvanWH;
    private SalesInvoice sales;

    
    /**
     * Sales Associate constructor
     * @param firstName First name of sales associate
     * @param lastName Last name of sales associate
     * @param emailAddress Email address of sales associate
     * @param userName Username of sales associate
     * @param password Password of sales associate
     * @param warehouseName Warehouse name of sales associate
     */
    public SalesAssociate(String firstName, String lastName, String emailAddress, String userName, String password, String warehouseName) {
        super(new Person(firstName, lastName, emailAddress), userName, password);
        this.WarehouseName = warehouseName;
        accountType = AccountType.SALES_ASSOCIATE;
        //this.Warehouse = warehouse;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //Getters & Setters

    /**
     * Get warehouse name
     * @return Warehouse name
     */
    public String getWarehouseName() {
        return WarehouseName;
    }

    /**
     * Set warehouse name
     * @param warehouseName Warehouse name 
     */
    public void setWarehouseName(String warehouseName) {
        WarehouseName = warehouseName;
    }

    /**
     * Get warehouse
     * @return Warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }
 
    /**
     * Get sales van warehouse
     * @return Sales van warehouse
     */
    public SalesVanWarehouse getWareHouse() { 
        
        return salesvanWH; 
    }

    /**
     * Set warehouse
     * @param warehouse Warehouse 
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
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

    