package duke;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    private final double MIN_PRICE = 10;
    private final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public Clothing setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price + (price * MIN_TAX);
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
        return MIN_TAX;
    }

    @Override
    public String toString() {
        return description + '\'' +
                ", price= " + price +
                "$" +
                ", size= '" + size + '\'';
    }
}
