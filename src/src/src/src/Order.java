package src;

public class Order {
    public void placeOrder(String user, String[] items) {
        System.out.println("Order placed by: " + user);
        for (String item : items) {
            System.out.println(" - " + item);
        }
    }
}
