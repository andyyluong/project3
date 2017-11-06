package project3;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyluong
 */

public class Warehouse {
    
    ArrayList<String> bpWarehouse = new ArrayList();
    
    public Warehouse(ArrayList<String> warehouse) {
        bpWarehouse = warehouse;
    }
    
    public ArrayList<String> getBikePart() {
        return bpWarehouse;
        
    }
    
    public void addBikePart(String part) {
        bpWarehouse.add(part);
    }
    
     
}

