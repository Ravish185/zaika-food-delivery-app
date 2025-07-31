package src;

import java.util.ArrayList;

public class Cart {
    ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void viewCart() {
        System.out.println("Cart Items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
