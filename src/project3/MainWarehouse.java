package project3;

/**
 * MainWarehouse defines a main warehouse
 * @author brianJustice
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author alexLundin
 */
public class MainWarehouse extends Warehouse {
    
    /**
     * Main Warehouse constructor
     * @param name Name of warehouse
     * @param warehouseType Warehouse type
     */
    public MainWarehouse(String name, WarehouseType warehouseType) {
        super(name, warehouseType);
    }
    
    /**
     * Find inventory by name
     * @param name Name of bike part in inventory
     * @return Bike part by name
     */
    public Inventory findInventoryByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Find inventory by number
     * @param number Number of bike part in inventory
     * @return Bike part by number
     */
    public Inventory findInventoryByNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Add inventory
     * @param part Part added to inventory
     */
    public void addInventory(String part) {
        String qualities[] = part.split(",");
        inventoryWarehouse.add(new Inventory(new BikePart(qualities[0], Integer.parseInt(qualities[1]), Double.parseDouble(qualities[2]), Double.parseDouble(qualities[3])), Boolean.parseBoolean(qualities[4]), Integer.parseInt(qualities[5])));
    }

    /**
     * Sell inventory
     * @param partNumber Part number of bike part to be sold
     * @param amount Amount to be sold
     */
    public void sell(int partNumber, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
