package project3;

import java.io.Serializable;

/**
 * MainWarehouse defines a main warehouse
 * @author brianJustice
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author alexLundin
 */
public class MainWarehouse extends Warehouse implements Serializable{
    
    /**
     * Main Warehouse constructor
     * @param name Name of warehouse
     * @param warehouseType Warehouse type
     */
    public MainWarehouse(String name, WarehouseType warehouseType) {
        super(name, warehouseType);
    }

    /**
     * Add inventory
     * @param part Part added to inventory
     */
    public void addInventory(String part) {
        String qualities[] = part.split(",");
        inventoryWarehouse.add(new Inventory(new BikePart(qualities[0], Integer.parseInt(qualities[1]), Double.parseDouble(qualities[2]), Double.parseDouble(qualities[3])), Boolean.parseBoolean(qualities[4]), Integer.parseInt(qualities[5])));
    }
    
}