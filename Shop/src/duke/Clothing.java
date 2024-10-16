package duke;

public class Clothing implements  Comparable<Clothing>{

    private String description;
    private double price;
    private String size = "M";

    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;

    Customer customer;


    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public String getDescription() {
        return description;
    }

    public Clothing setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public Clothing setPrice(double price) {

        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
        return this;
    }

    public Clothing setSize(String size) {
        this.size = size;
        return this;
    }

    public String getSize() {
        return size;
    }

    public double getMIN_PRICE() {
        return MIN_PRICE;
    }

    public double getMIN_TAX() {
        return TAX_RATE;
    }

    @Override
    public String toString() {
        return description + '\'' +
                ", price= " + price +
                "$" +
                ", size= '" + size + '\'';
    }

    @Override
    public int compareTo(Clothing o) {

        return this.description.compareTo(o.description);
    }
}
