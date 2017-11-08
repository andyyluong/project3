package project3;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public interface Warehouse
{
    ArrayList<Inventory> inventoryWarehouse = new ArrayList();
            
    public Inventory findInventoryByName(String name);
    
    public Inventory findInventoryByNumber(int number);
    
    public void addInventory(String part);
    
    public void sell(int partNumber, int amount);
    
    //public String sortName();
    
    //public String sortNumber();
}
