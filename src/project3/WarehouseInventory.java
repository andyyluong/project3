package project3;

/**
 * WarehouseInventory class defines a warehouse inventory
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
import java.io.Serializable;
import java.util.ArrayList;

public class WarehouseInventory implements Serializable {
  private ArrayList<Warehouse> warehouseInventory;
  
  /**
   * Warehouse inventory constructor
   */
  public WarehouseInventory(){
    warehouseInventory = new ArrayList<>();
    }
  
  /**
   * Add a warehouse to warehouse inventory
   * @param warehouse Warehouse being added
   */
  public void add(Warehouse warehouse){
    warehouseInventory.add(warehouse);
  }
  
}