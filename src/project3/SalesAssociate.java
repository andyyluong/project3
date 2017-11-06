/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class SalesAssociate extends LoginAccount {
    
    private String WarehouseName;
    private Warehouse Warehouse;

    public SalesAssociate(Person p, String aUserName, String aPassword, String aWarehouseName, Warehouse aWarehouse) {
        super(p, aUserName, aPassword);
        WarehouseName = aWarehouseName;
        Warehouse = aWarehouse;
    }
   
    public void setWarehouseName(String aWarehouseName) {
        WarehouseName = aWarehouseName;
    }
    
    public String getWarehouseName() {
        return WarehouseName;
    }
    
    public void setWarehouse(Warehouse w) {
        Warehouse = w;
    }
    
    public Warehouse getWarehouse() {
        return Warehouse;
    }
    
    
    
    
    
}

    
