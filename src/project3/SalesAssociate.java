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
    private AccountType accountType;
    private SalesVanWarehouse warehouse;
    private SalesInvoice sales;

    
    /**
     * Sales Associate constructor
     * @param person Person object
     * @param userName Username of sales associate
     * @param password Password of sales associate
     * @param warehouseName Warehouse name of sales associate
     */
    public SalesAssociate(Person person, String userName, String password, String warehouseName) {
        super(person, userName, password);
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
        
        return warehouse; 
    }

    /**
     * Set warehouse
     * @param warehouse Warehouse 
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = (SalesVanWarehouse) warehouse;
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
