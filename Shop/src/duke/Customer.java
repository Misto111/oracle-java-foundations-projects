package duke;

public class Customer {

    private String name;
    private String size;

    private Clothing[] items;

    public Customer() {

    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {

        double total = 0;
        for (Clothing item : items) {

            total = total + item.getPrice();
      }

        return total;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Customer setSize(String size) {
        this.size = size;
        return this;
    }

    public Customer setSize(int measurement) {

        switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Customer " +
                "name= '" + name + '\'' +
                ", size= '" + size + '\'' +
                ", " +
                "Total price = " + getTotalClothingCost() +
                "$";
    }
}
