package project3;

/**
 *
 * class Person
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 * This is a BikePart class that stores information about bicycle part
 * partName - The name of the part
 * partNumber - The number of the part
 * listPrice - The list price of the part
 * salesPrice -  The sales price of the part
 * onSale - Parts that are on sale
 * quantity - The quantity of parts
 *
 */
public class BikePart {

    private String partName;
    private int partNumber;
    private double listPrice;
    private double salesPrice;
    private boolean onSale;
    private int quantity;

    /** Description of BikePart Class
     * This class stores information about the following bicycle information:
     * part name, list price, sales price, and if the part is on sale.
     * Method BikePart
     * @param partName
     * @param partNumber
     * @param listPrice
     * @param salesPrice
     * @param onSale
     */
    public BikePart(String partName, int partNumber, double listPrice, double salesPrice, boolean onSale, int quantity) {
        this.partName = partName;
        this.partNumber = partNumber;
        this.listPrice = listPrice;
        this.salesPrice = salesPrice;
        this.onSale = onSale;
        this.quantity = quantity;
    }

    /**
     * Method setPartName
     * @param partName
     * The name of the part
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * Method getPartName
     * @return partName
     * The name of the part
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Method setPartNumber
     * @param partNumber
     * The number of the part
     */
    public void setPartNumber(int partNumber){
        this.partNumber = partNumber;
    }

    /**
     * Method getPartNumber
     * @return partNumber
     * The number of the part
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Method setListPrice
     * @param listPrice
     * The list price of the part
     */
    public void setListPrice(double listPrice){
        this.listPrice = listPrice;
    }

    /**
     * Method getListPrice
     * @return listPrice
     * The list price of the part
     */
    public double getListPrice() {
        return listPrice;
    }

    /**
     * Method setSalesPrice
     * @param salesPrice
     * The sales price of the part
     */
    public void setSalesPrice(double salesPrice){
        this.salesPrice = salesPrice;
    }

    /**
     * Method getSalesPrice
     * @return salesPrice
     * The sales price of the part
     */
    public double getSalesPrice() {
        return salesPrice;
    }

    /**
     * Method setOnSale
     * @param onSale
     * Parts that are on sale
     */
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }

    /**
     * Method getOnSale
     * @return onSale
     * Parts that are on sale
     */
    public boolean getOnSale() {
        return onSale;
    }

    /**
     * Method setQuantity
     * @param quantity
     * The quantity of parts
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * Method getQuantity
     * @return quantity
     * The quantity of parts
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Method toString
     * @return partName - The name of the part
     * @return partNumber - The number of the part
     * @return listPrice - The list price of the part
     * @return salesPrice -  The sales price of the part
     * @return onSale - Parts that are on sale
     * @return quantity - The quantity of parts
     */
    public String toString() {
        return partName + "," + partNumber + "," + listPrice + "," + salesPrice + "," + onSale + "," + quantity;
    }
}
