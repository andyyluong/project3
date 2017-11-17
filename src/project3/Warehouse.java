package project3;

import java.util.ArrayList;
import java.io.Serializable;
/**
 * Warehouse class contains information about a warehouse
 * @author brianJustice
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author alexLundin
 */
public abstract class Warehouse implements Serializable
{
    private ArrayList<Inventory> inventoryWarehouse;
    private String name;
    private WarehouseType warehouseType;
    
    /**
     * Warehouse constructor
     * @param name Name of warehouse
     * @param warehouseType Warehouse type
     */
    public Warehouse(String name, WarehouseType warehouseType)
    {
        inventoryWarehouse = new ArrayList<>();
        this.name = name;
        this.warehouseType = warehouseType;
    }
    
    /**
     * Get warehouse type
     * @return Warehouse type
     */
    public WarehouseType getType()
    {
        return warehouseType;
    }
            
    public Inventory findInventoryByName(String name);
    
    public Inventory findInventoryByNumber(int number);
    
    public void addInventory(String part);
    
    public void sell(int partNumber, int amount);
    
    public String sortName();
    
    public String sortNumber();
}
