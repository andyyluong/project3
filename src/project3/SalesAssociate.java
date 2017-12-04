package project3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import person.Person;
/**
 * Sales Associate class defines the actions of a sales associate employee
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class SalesAssociate extends LoginAccount implements Serializable {
    
    /**
     * Data members
     */
    private String WarehouseName;
    private Warehouse warehouse;
    private AccountType accountType;
    private SalesVanWarehouse salesvanWH;
    private List<SalesInvoice> sales;

    
    /**
     * Sales Associate constructor
     * @param p Person that is a sales associate
     * @param userName Username of sales associate
     * @param password Password of sales associate
     * @param warehouseName Warehouse name of sales associate
     */
    public SalesAssociate(Person p, String userName, String password, String warehouseName) {
        super(p, userName, password);
        this.WarehouseName = warehouseName;
        salesvanWH = new SalesVanWarehouse(warehouseName, WarehouseType.SALES);
        Main.warehouseInventory.add(salesvanWH);
        accountType = AccountType.SALES_ASSOCIATE;
    }

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
    public SalesVanWarehouse getWarehouse() {
        return salesvanWH;
    }

    /**
     * Set warehouse
     * @param warehouse Warehouse 
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = salesvanWH;
    }

    /**
     * Get account type
     * @return Account type
     */
    @Override
    public AccountType getType() {
        return accountType;
    }

    /**
     * Get sales invoice from start to end date of sales associate
     * @param startDate Start date of sales invoice
     * @param endDate End date of sales invoice
     * @return Sales invoice with sales from indicated dates
     */
    public List<SalesInvoice> getSales(Date startDate, Date endDate) {
        List<SalesInvoice> salesList = new ArrayList<>();
        for (SalesInvoice si : sales) {
            if (startDate == null) {
                salesList.add(si);
            }
            else {
                if (startDate.compareTo(si.getSaleDate()) <= 0 && endDate.compareTo(si.getSaleDate()) >= 0)
                    salesList.add(si);
            }
        }
        return salesList;
    }
}