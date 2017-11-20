package cost;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * class Cost
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 * Cost uses BigDecimal to store $ values with 2 decimal digits.
 *
 */

public class Cost {

    private BigDecimal cost;

    public Cost(String cost) {
        this.cost = new BigDecimal(cost);
    }

    public String getCost() { return cost.setScale(2, RoundingMode.HALF_EVEN).toString(); }

    public void setCost(String cost) {
        this.cost = new BigDecimal(cost);
    }

    public String toString(){
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString();
    }

    public boolean equals(Cost c) {
        return cost.setScale(2, RoundingMode.HALF_EVEN).toString().equals(c.getCost());
    }

}
