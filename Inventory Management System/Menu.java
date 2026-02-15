package ims;

import java.util.Scanner;

public class Menu {
    private Inventory inventory;
    private Scanner scanner;

    public Menu(Inventory inventory) {
        this.inventory = inventory;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. View Inventory");
            System.out.println("4. Sell Product");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: addElectronics(); break;
                case 2: addClothing(); break;
                case 3: inventory.showInventory(); break;
                case 4: processSale(); break;
                case 0: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private void addElectronics() {
        System.out.print("ID: "); int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Name: "); String name = scanner.nextLine();
        System.out.print("Price: "); double price = scanner.nextDouble();
        System.out.print("Stock: "); int stock = scanner.nextInt();
        System.out.print("Warranty (Months): "); int warranty = scanner.nextInt();

        inventory.addProduct(new Electronics(id, name, price, stock, warranty));
        System.out.println("Electronics added!");
    }

    private void addClothing() {
        System.out.print("ID: "); int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Name: "); String name = scanner.nextLine();
        System.out.print("Price: "); double price = scanner.nextDouble();
        System.out.print("Stock: "); int stock = scanner.nextInt(); scanner.nextLine();
        System.out.print("Size (S/M/L/XL): "); String size = scanner.nextLine();

        inventory.addProduct(new Clothing(id, name, price, stock, size));
        System.out.println("Clothing added!");
    }

    private void processSale() {
        System.out.print("Enter Product ID to sell: ");
        int id = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        inventory.sellProduct(id, qty);
    }
}