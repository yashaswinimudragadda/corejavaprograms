package ims;

public class Main {
    public static void main(String[] args) {
        // Initialize the logic class
        Inventory myStore = new Inventory();

        // Pass the logic to the UI class
        Menu ui = new Menu(myStore);

        // Run
        ui.start();
    }
}