package project3;
import java.io.Serializable;
/**
 *
 * class Main
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 */

public class SalesAssociate extends LoginAccount, Serializable {
    private String WarehouseName;
    private Warehouse warehouse;

    public SalesAssociate(String firstName, String lastName, int age, int phoneNumber, String emailAddress,
                          String userName, String password, String warehouseName) {
        super(new Person(firstName, lastName, age, phoneNumber, emailAddress), userName, password);
        this.WarehouseName = warehouseName;
        //this.Warehouse = warehouse;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //Getters & Setters

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        WarehouseName = warehouseName;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}

