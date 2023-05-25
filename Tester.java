import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>(); // Create an ArrayList to store the orders

        do {
            System.out.print("Enter order ID (0 to exit): ");
            int orderId = input.nextInt();
            if (orderId == 0) {
                break;
            }

            input.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter item names separated by commas: ");
            String itemNamesInput = input.nextLine();
            ArrayList<String> itemNames = new ArrayList<>(java.util.Arrays.asList(itemNamesInput.split(",")));
            // Create an ArrayList of item names by splitting the input string using commas

            System.out.print("Is cash on delivery? (true/false): ");
            boolean isCashOnDelivery = input.nextBoolean();

            // Create an instance of the Order class with the provided input
            Order order = new Order(orderId, itemNames, isCashOnDelivery);
            orders.add(order); // Add the order to the ArrayList

        } while (true);

        input.close();

        ArrayList<String> allItems = new ArrayList<>(); // Create an ArrayList to store all items

        for (Order order : orders) {
            ArrayList<String> items = order.getItems(); // Get the list of items from each order
            allItems.addAll(items); // Add the items to the allItems ArrayList
        }

        System.out.println("List of items present in all orders: ");
        System.out.println(allItems);
    }
}

class Order {
    private int orderId;
    private ArrayList<String> itemNames; // ArrayList to store the item names
    private boolean isCashOnDelivery;

    public Order(int orderId, ArrayList<String> itemNames, boolean isCashOnDelivery) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.isCashOnDelivery = isCashOnDelivery;
    }

    public ArrayList<String> getItems() {
        return itemNames;
    }

    public int getOrderId() {
        return orderId;
    }

    public boolean isCashOnDelivery() {
        return isCashOnDelivery;
    }
}
