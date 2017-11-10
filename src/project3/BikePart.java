/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.io.Serializable;

/**
 *
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 * 
 * This is a BikePart class that stores information about bicycle part
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
     * Method setPartName
     * @param partName Bike part name
     * Set the name of the part
     */
    public void setPartName(String partName) {

        this.partName = partName;

    }

    /**
     * Method getPartName
     * @return partName
     * Get the name of the part
     */
    public String getPartName() {

        return partName;

    }

    /**
     * Method setPartNumber
     * @param partNumber Bike part number
     * Set the number of the part
     */
    public void setPartNumber(int partNumber){

        this.partNumber = partNumber;

    }

    /**
     * Method getPartNumber
     * @return partNumber Bike part number
     * Get the number of the part
     */
    public int getPartNumber() {

        return partNumber;
    }

    /**
     * Method setListPrice
     * @param listPrice Bike part list price
     * Set the list price of the part
     */
    public void setListPrice(double listPrice){

        this.listPrice = listPrice;
    }

    /**
     * Method getListPrice
     * @return listPrice Bike part list price
     * Get the list price of the part
     */
    public double getListPrice() {

        return listPrice;
    }

    /**
     * Method setSalesPrice
     * @param salesPrice Bike part sales price
     * Set the sales price of the part
     */
    public void setSalesPrice(double salesPrice){

        this.salesPrice = salesPrice;
    }

    /**
     * Method getSalesPrice
     * @return salesPrice Bike part sales price
     * Get the sales price of the part
     */
    public double getSalesPrice() {

        return salesPrice;
    }

    /**
     * Method toString
     * @return part name, part number, list price, and sales price
     */
    @Override
    public String toString() {

        return partName + "," + partNumber + "," + listPrice + "," + salesPrice;
    }
}
