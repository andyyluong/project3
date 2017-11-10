/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.io.Serializable;


/**
 *
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class Inventory implements Serializable {
    private BikePart bikePart;
    private Boolean onSale;
    private int quantity;
    
    public Inventory(BikePart bikepart, Boolean onSale){
        this.bikePart = bikepart;
        this.onSale = onSale;
    }
    public void add(int number){
        quantity += number;
    }
    
    public void take(int number){
        quantity -= number;
    }
    
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }
    
    public Boolean getOnSale(){
        return onSale;
    }
    
    @Override
    public String toString(){
        return bikePart.toString() + "," + onSale + "," + quantity;
    }

    public String getName(){
        return bikePart.getPartName();
    }

    public double getSalesPrice(){
        return bikePart.getSalesPrice();
    }

    public int getNumber(){
        return bikePart.getPartNumber();
    }

    public double getListPrice(){
        return bikePart.getListPrice();
    }
}
    
