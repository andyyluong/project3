package project3;

/**
 * SalesVanWarehouse class defines a sales van warehouse
 * @author brian
 */
public class SalesVanWarehouse extends Warehouse {

    public SalesVanWarehouse(String name, WarehouseType warehouseType) {
        super(name, warehouseType);
    }

    public Inventory findInventoryByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Inventory findInventoryByNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addInventory(String part) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sell(int partNumber, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}