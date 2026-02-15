package ims;

public class Clothing extends Product {
    private String size; // e.g., S, M, L, XL

    public Clothing(int id, String name, double price, int stock, String size) {
        // super() sends the common data to the Product parent class
        super(id, name, price, stock);
        this.size = size;
    }

    // Polymorphism: Implementing the tax logic specifically for clothing
    @Override
    public double calculateTotalBill(int buyQuantity) {
        double tax = 0.05; // 5% GST for clothing
        double subTotal = getPrice() * buyQuantity;
        return subTotal + (subTotal * tax);
    }

    @Override
    public void displayBaseDetails() {
        super.displayBaseDetails(); // Calls the parent's print method
        System.out.println(" | Size: " + size + " | Category: Clothing");
    }
}