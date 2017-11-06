import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author andyluong
 */


/**
 * Cost uses BigDecimal to store $ values with 2 decimal digits.
 */

public class Cost {
    
    private BigDecimal cost;

    public Cost(String cost) { 
        this.cost = new BigDecimal(cost);
    }

    public String getCost() { 
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString();
    }

    public void setCost(String cost) { 
        this.cost = new BigDecimal(cost); 
    }

    @Override
    public String toString(){ 
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString(); 
    }

    public boolean equals(Cost c) {
      return cost.setScale(2, RoundingMode.HALF_EVEN).toString().equals(c.getCost());
    }

    int compareTo(Cost c) {
        return this.getCost().compareTo(c.getCost());
    }

    
}

