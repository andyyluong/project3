package project3;

/**
 * DiscountedItem contains a decorator for an item that applies a discount
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class DiscountedItem implements SalesItem {

    /**
     * Data members
     */
    private final double discount;
    private final SalesItem item;
    
    /**
     * Discounted Item constructor
     * @param item Bike part item
     * @param discount Discount of bike part item
     */
    public DiscountedItem(SalesItem item, double discount) {
        this.item = item;
        this.discount = discount;
    }

    /**
     * Get price of discounted item
     * @return Discounted item
     */
    @Override
    public double getPrice() {
        return item.getPrice() * (1 - discount / 100);
    }
    
    /**
     * Display discounted item
     * @return Discounted item
     */
    @Override
    public String toString() {
        return item.toString() + " (Discount " + discount + "%)";
    }
    
    /**
     * Get name of discounted item
     * @return Discounted bike part item name
     */
    @Override
    public String getName() {
        return item.getName();
    }
    
}
