import duke.Clothing;
import duke.Customer;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Duke Choice Shop");
        System.out.println("Minimum price = " + Clothing.MIN_PRICE + "$");
        System.out.println("Type your size below:");

        int measurement = Integer.parseInt(sc.nextLine());

        Customer customer = new Customer("Pinky", "S", measurement);

        Clothing item1 = new Clothing("Green Scarf", 5, "S");
        Clothing item2 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Blue Jacket", 20.9, "M"), new Clothing("Orange T-Shirt", 12.6, "S")};

        customer.addItems(items);

        System.out.println(customer);

        for (Clothing item : customer.getItems()) {


            System.out.println("Item: " + item);

            //System.out.printf("Total price %.2f", total);

        }

    }

}


