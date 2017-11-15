import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Cost uses BigDecimal to store $ values with 2 decimal digits.
 * @author andyLuong
 * @author anthonyPhimmasone
 * @author brianJustice
 * @author alexLundin
 */
public class Cost {
    
    private BigDecimal cost;

    /**
     * Cost constructor
     * @param cost Cost value
     */
    public Cost(String cost) { 
        this.cost = new BigDecimal(cost);
    }

    /**
     * Get cost value
     * @return Cost value
     */
    public String getCost() { 
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString();
    }

    /**
     * Set cost value
     * @param cost Cost value
     */
    public void setCost(String cost) { 
        this.cost = new BigDecimal(cost); 
    }

    /**
     * Display cost value
     * @return Cost value
     */
    @Override
    public String toString(){ 
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString(); 
    }

    /**
     * Boolean method to determine cost value
     * @param c Cost
     * @return Cost if it equals cost value
     */
    public boolean equals(Cost c) {
      return cost.setScale(2, RoundingMode.HALF_EVEN).toString().equals(c.getCost());
    }

    /**
     * Compare two cost values
     * @param c Cost
     * @return Comparison of two cost values
     */
    int compareTo(Cost c) {
        return this.getCost().compareTo(c.getCost());
    }
    
}

