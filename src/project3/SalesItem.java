/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 * A sale item in an invoice
 * @author andyluong
 */
public interface SalesItem {
    /**
     * Get the price of the sales item
     * @return the price
     */
    double getPrice();
    
    /**
     * Get the name of the sales item
     * @return the name
     */
    String getName();
    
    /**
     * Gets the description of this sale item
     * @return the description
     */
    @Override
    String toString();
    
}