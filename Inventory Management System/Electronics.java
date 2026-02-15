package ims;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(int id, String name, double price, int stock, int warrantyMonths) {
        // 'super' calls the constructor of the parent Product class
        super(id, name, price, stock); 
        this.warrantyMonths = warrantyMonths;
    }

    // Implementing the abstract method from Product (Polymorphism)
    @Override
    public double calculateTotalBill(int buyQuantity) {
        double tax = 0.18; // 18% GST for electronics
        double totalWithoutTax = getPrice() * buyQuantity;
        return totalWithoutTax + (totalWithoutTax * tax);
    }

    @Override
    public void displayBaseDetails() {
        super.displayBaseDetails(); // Calls the print method from Product
        System.out.println(" | Warranty: " + warrantyMonths + " months | Category: Electronics");
    }
}