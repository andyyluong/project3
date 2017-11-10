package project3;
   
import java.util.*;

/**
 * A bundle of line items that is again a line item.
 * andyluong
 */
public class Bundle implements SalesItem {
   
    private ArrayList<SalesItem> items;
   
    /**
     * Constructs a bundle with no items.
     */
    public Bundle() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the bundle.
     *
     * @param item the item to add
     */

    public void add(SalesItem item) {
        items.add(item);
    }
     
    @Override
    public double getPrice() {
        double price = 0;

        for (SalesItem item : items)
            price += item.getPrice();
        return price;
    }
   
    @Override
    public String getName() {
        String name = "";
        
        for(SalesItem item : items)
            name = item.getName();
        return name;
    }
    
    @Override
    public String toString() {
        String description = "Bundle: ";
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) description += ", ";
            description += items.get(i).toString();
        }
        return description;
    }

}
    
