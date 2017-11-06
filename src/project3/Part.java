/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andyluong
 */
public class Part {
    protected String name;
    protected String number;
    protected Cost price;


    public Part(String name, String number, String cost) {
        this.name = name;
        this.number = number;
        this.price = new Cost(cost);
    }

    public String getName() { 
        return name; 
    }
    public String getNumber() { 
        return number; 
    }
    public String getPrice() { 
        return price.toString(); 
    }
    public void setPrice(String price) { 
        this.price = new Cost(price); 
    }

    
}
