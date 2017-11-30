package project3;

import java.util.Comparator;

/**
 *
 * @author brianjustice
 * @author andyluong
 * @author anthonyphimmasone
 */
public class InventoryComparatorByName implements Comparator{

    @Override
    public int compare(Object o1, Object o2)
    {
        Inventory i1 = (Inventory) o1;
        Inventory i2 = (Inventory) o2;
        return i1.getName().compareToIgnoreCase(i2.getName());
    }
}
