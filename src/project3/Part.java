/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Part class contains information about a part
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class Part {
    protected String name;
    protected String number;
    protected Cost price;

    /**
     * Part constructor
     * @param name Name of part
     * @param number Number of part
     * @param cost Cost of part
     */
    public Part(String name, String number, String cost) {
        this.name = name;
        this.number = number;
        this.price = new Cost(cost);
    }

    /**
     * Get name of part
     * @return Name of part
     */
    public String getName() { 
        return name; 
    }
    
    /**
     * Get number of part
     * @return Number of part
     */
    public String getNumber() { 
        return number; 
    }
    
    /**
     * Get price of part
     * @return Price of part
     */
    public String getPrice() { 
        return price.toString(); 
    }
    
    /**
     * Set price of part
     * @param price Price
     */
    public void setPrice(String price) { 
        this.price = new Cost(price); 
    }

    
}
