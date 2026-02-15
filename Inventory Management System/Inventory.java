package ims;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Add a product to the list
    public void addProduct(Product p) {
        products.add(p);
    }

    // Display all products using Polymorphism
    public void showInventory() {
        System.out.println("\n--- Current Inventory ---");
        for (Product p : products) {
            p.displayBaseDetails(); // Calls the correct version (Electronics or Clothing)
        }
    }

    // The "Sell" Logic (Crucial for IMS)
    public void sellProduct(int id, int qty) {
        for (Product p : products) {
            if (p.getId() == id) {
                if (p.getStock() >= qty) {
                    double bill = p.calculateTotalBill(qty);
                    p.setStock(p.getStock() - qty); // Reduce stock
                    System.out.println("Sale Successful!");
                    System.out.println("Product: " + p.getname());
                    System.out.println("Total Bill (inc. tax): " + bill);
                } else {
                    System.out.println("Error: Not enough stock! Only " + p.getStock() + " left.");
                }
                return;
            }
        }
        System.out.println("Error: Product ID " + id + " not found.");
    }
}