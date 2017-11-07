package project3;

/**
 *
 * class Part
 * @author andyluong
 * @author anthonyPhimmasone
 * @author brianJustice
 *
 */

public class Part {
    protected String name;
    protected String number;
    protected Cost price;


    public Part(String name, String number, String cost) {
        this.name = name;
        this.number = number;
        this.price = new Cost(cost);
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getPrice() {
        return price.toString();
    }
    public void setPrice(String price) {
        this.price = new Cost(price);
    }
}
