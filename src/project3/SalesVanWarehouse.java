package project3;

/**
 * SalesVanWarehouse class defines a sales van warehouse
 * @author brianJustice
 * @author andyLuong
 * @author anthonyPhimmasone
 */
public class SalesVanWarehouse extends Warehouse {
    
    WarehouseInventory salesVanwhDB;

    /**
     * Sales Van Warehouse Constructor
     * @param name Name of warehouse
     * @param warehouseType Warehouse type
     */
    public SalesVanWarehouse(String name, WarehouseType warehouseType) {
        super(name, warehouseType);
    }

    /**
     * Find inventory by name
     * @param name Name of inventory
     * @return Inventory attributes by name
     */
    public Inventory findInventoryByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Find inventory by number
     * @param number Number of inventory
     * @return Inventory attributes by number
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
     * @param partName Part name of inventory
     * @param amount Amount of inventory
     */
    public void sell(String partName, int amount) {
        Inventory inventory = null;
        for(Inventory i: inventoryWarehouse){
            if(i.getName().equals(partName)){
                inventory = i;
            }
        }
        System.out.println(inventory.getQuantity());
        inventory.remove(amount);
        System.out.println(inventory.getQuantity());
        System.out.println(inventory.getName());
    }
    
}
