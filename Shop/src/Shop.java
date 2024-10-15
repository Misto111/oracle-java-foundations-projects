import duke.Clothing;
import duke.Customer;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Duke Choice Shop");

        double tax = 0.02;
        double total = 0.00;
        int measurement = Integer.parseInt(sc.nextLine());


        Customer customer = new Customer();
        customer.setName("Pinky");
        customer.setSize(measurement);

        System.out.println(customer);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();


        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");



        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(12.6);
        item2.setSize("S");





        for (Clothing item : items) {

            if(customer.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                System.out.println("Clothing item: " + item);

                if (total > 15) {
                    break;
                }

            }

        }

        System.out.printf("Total price %.2f", total);



    }
}

