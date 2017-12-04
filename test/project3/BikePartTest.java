package project3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * BikePartTest contains the Bike part class for JUnit test
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 */
public class BikePartTest {
    
    /**
     * Test of getPartName method, of class BikePart.
     */
    @Test
    public void testGetPartName() {
        System.out.println("Get Part Name");
        BikePart instance = new BikePart();
        String expResult = "bikehandle";
        String result = instance.getPartName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPartNumber method, of class BikePart.
     */
    @Test
    public void testGetPartNumber() {
        System.out.println("Get Part Number");
        BikePart instance = new BikePart();
        int expResult = 1234567890;
        int result = instance.getPartNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPrice method, of class BikePart.
     */
    @Test
    public void testGetPrice() {
        System.out.println("Get Price");
        BikePart instance = new BikePart();
        double expResult = 10.0;
        double result = instance.getListPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getSalesPrice method, of class BikeParts.
     */
    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        BikePart instance = new BikePart();
        double expResult = 8.0;
        double result = instance.getSalesPrice();
        assertEquals(expResult, result, 0.0);

    }

    
}
