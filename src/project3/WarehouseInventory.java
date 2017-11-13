package project3

/**
* @author andyluong
* @author anthonyPhimmasone
* @author brianJustice
* @author alexLundin
*/
import java.io.Serializable;
import java.util.ArrayList;

public class WarehouseInventory{
  private ArrayList<Warehouse> warehouseInventory;
  
  public WarehouseInventory(){
    warehouseInventory = new ArrayList<>();
    }
  
  public void add(Warehouse warehouse){
    warehouseInventory.add(warehouse);
  }
}
