/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 * Class BikePart
 * @author andyluong
 * @author AnthonyPhimmasone
 * @author BrianJustice
 */
public class BikePart {

/**
 * Data members
 */    
    String partName;
    int partNumber;
    double price;
    double salesPrice;
    boolean onSale;
    int quantity;

/**
 * Constructor initializes fields
 * @param partName name of bike part
 * @param partNumber bike part number
 * @param price price of bike part
 * @param salesPrice sales price of bike part
 * @param onSale bike part on sale or not
 * @param quantity bike part quantity
 */

    public BikePart(String partName, int partNumber, double price, double salesPrice, 
            boolean onSale, int quantity) {
        this.partName = partName;
        this.partNumber = partNumber;
        this.price = price;
        this.salesPrice = salesPrice;
        this.onSale = onSale;
        this.quantity = quantity;
        
    }

    /**
     * setPartName set bike part name
     * @param partName name of bike part
     */
    public void setPartName(String partName) {
        this.partName = partName; 
        
    }
    
    /**
     * getPartName get bike part name
     * @return bike part name
     */
    public String getPartName() {
        return partName;
        
    }
    
    /**
     * setPartNumber set bike part number
     * @param partNumber bike part number 
     */
    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
        
    }
    
    /**
     * getPartNumber get bike part number
     * @return bike part number
     */
    public int getPartNumber() {
        return partNumber;
        
    }
    
    /**
     * setPrice set bike part price
     * @param price bike part price 
     */
    public void setPrice(double price) {
        this.price = price;
        
    }
    
    /**
     * getPrice get bike part price
     * @return bike part price
     */
    public double getPrice() {
        return price;
        
    }
    
    /**
     * setSalesPrice set bike part sale price
     * @param salesPrice sale price of bike part
     */
    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice; 
        
    }
    
    /**
     * getSalesPrice get bike part sale price
     * @return bike part sale price
     */
    public double getSalesPrice() {
        return salesPrice;
        
    }
    
    /**
     * onSale set bike part on sale or not
     * @param onSale bike part on sale or not 
     */
    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
        
    }
    
    /**
     * getOnSale get bike part on sale or not
     * @return bike part on sale or not
     */
    public boolean getOnSale() {
        return onSale;
    }
    
   /**
     * setQuantity set bike part quantity
     * @param quantity bike part quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        
    }
    
    /**
     * getQuantity get bike part quantity
     * @return bike part quantity
     */
    public int getQuantity() {
        return quantity;
    }
  
    /**
     * toString display bike part attributes
     * @return part name, part number, price, sale price, on sale, quantity
     */
    @Override
    public String toString() {
        return this.partName + "," + this.partNumber + "," + this.price + "," 
               + this.salesPrice + "," + this.onSale + "," + this.quantity;

    }
    
}
