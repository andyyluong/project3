package project3;

/**
 * A sale item in an invoice
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
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
     * @return The description
     */
    @Override
    String toString();
    
}