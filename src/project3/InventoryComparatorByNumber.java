package project3;

import java.util.Comparator;

/**
 * Concrete comparator implementation that compares inventory by number
 * @author brianJustice 
 * @author andyLuong
 * @author anthonyPhimmasone
 */
public class InventoryComparatorByNumber implements Comparator {

    /**
     * Compare inventory by number
     * @param o1 Calling object
     * @param o2 Parameter object
     * @return Negative number, zero, or positive number
     */
    @Override
    public int compare(Object o1, Object o2)
    {
        Inventory i1 = (Inventory) o1;
        Inventory i2 = (Inventory) o2;
        if(i1.getNumber()<i2.getNumber())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}