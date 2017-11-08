/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 * A decorator for an item that applies a discount
 * @author andyluong
 */

public class DiscountedItem implements SalesItem {

    private final double discount;
    private final SalesItem item;
    
    public DiscountedItem(SalesItem item, double discount) {
        this.item = item;
        this.discount = discount;
    }


    @Override
    public double getPrice() {
        return item.getPrice() * (1 - discount / 100);
    }
    

    @Override
    public String toString() {
        return item.toString() + " (Discount " + discount + "%)";
    }
    
    @Override
    public String getName() {
        return item.getName();
    }
    
}
