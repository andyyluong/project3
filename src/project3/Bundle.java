package project3;
   
import java.util.*;

/**
 * A bundle of sales items that is a single sales item.
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class Bundle implements SalesItem {
    
    /**
     * Constructs a bundle with no items.
     */
    public Bundle() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the bundle.
     * @param item the item to add
     */
    public void add(SalesItem item) {
        items.add(item);
    }

    /**
     * Get price of sales item
     * @return Price of sales item
     */
    @Override
    public double getPrice() {
        double price = 0;

        for (SalesItem item : items)
            price += item.getPrice();
        return price;
    }
    /**
     * Display bundle description
     * @return Description of bundle items
     */
    @Override
    public String toString() {
        String description = "Bundle: ";
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) description += ", ";
            description += items.get(i).toString();
        }
        return description;
    }
    
    private ArrayList<SalesItem> items;

    /**
     * Get name of sales item
     * @return Name of sales item
     */
    @Override
    public String getName() {
        String name = "";
        
        for(SalesItem item : items)
            name = item.getName();
        return name;
    }
}
    