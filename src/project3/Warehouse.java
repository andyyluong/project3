package project3;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author brian
 */
public abstract class Warehouse Implements Serializable
{
    private ArrayList<Inventory> inventoryWarehouse;
    private String name;
    private WarehouseType warehouseType;
    
    public Warehouse(String name, WarehouseType warehouseType)
    {
        inventoryWarehouse = new ArrayList<>();
        this.name = name;
        this.warehouseType = warehouseType;
    }
    
    public WarehouseType getType()
    {
        return warehouseType;
    }
            
    public Inventory findInventoryByName(String name);
    
    public Inventory findInventoryByNumber(int number);
    
    public void addInventory(String part);
    
    public void sell(int partNumber, int amount);
    
    //public String sortName();
    
    //public String sortNumber();
}
