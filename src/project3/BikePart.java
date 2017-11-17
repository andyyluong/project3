package project3;

import java.io.Serializable;

/**
 * This is a BikePart class that stores information about bicycle part
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class BikePart implements Serializable {

    private String partName;

    private int partNumber;

    private double listPrice;

    private double salesPrice;

    /**
     * BikePart constructor
     * @param partName Bike part name
     * @param partNumber Bike part number
     * @param listPrice Bike part list price
     * @param salesPrice Bike part sales price
     */
    public BikePart(String partName, int partNumber, double listPrice, double salesPrice) {

        this.partName = partName;

        this.partNumber = partNumber;

        this.listPrice = listPrice;

        this.salesPrice = salesPrice;
    }

    /**
     * Set part name of the part
     * @param partName Part name
     */
    public void setPartName(String partName) {

        this.partName = partName;

    }

    /**
     * Get part name of the part
     * @return Bike Part name 
     */
    public String getPartName() {

        return partName;

    }

    /**
     * Set the number of the part
     * @param partNumber Bike part number
     */
    public void setPartNumber(int partNumber){

        this.partNumber = partNumber;

    }

    /**
     * Get the number of the part
     * @return Bike part number
     */
    public int getPartNumber() {

        return partNumber;
    }

    /**
     * Set the list price of the part
     * @param listPrice Bike part list price
     */
    public void setListPrice(double listPrice){

        this.listPrice = listPrice;
    }

    /**
     * Get the list price of the part
     * @return Bike part list price
     */
    public double getListPrice() {

        return listPrice;
    }

    /**
     * Set the sales price of the part
     * @param salesPrice Bike part sales price
     */
    public void setSalesPrice(double salesPrice){

        this.salesPrice = salesPrice;
    }

    /**
     * Get the sales price of the part
     * @return salesPrice Bike part sales price
     */
    public double getSalesPrice() {

        return salesPrice;
    }

    /**
     * toString Displays bike part attributes
     * @return part name, part number, list price, and sales price
     */
    @Override
    public String toString() {

        return partName + "," + partNumber + "," + listPrice + "," + salesPrice;
    }
    
    /**
     * BikePart constructor for JUnit Test
     */
    public BikePart() {
        
        partName = "bikehandle";
        partNumber = 1234567890;
        listPrice = 10.0;
        salesPrice = 8.0;
        
    }
}
