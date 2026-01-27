package whileloops;

public class Whiletest4 {
    public static void main(String[] args) {
        int n = 153; 
        int temp = n; // Store original n for the second loop
        int count = 0;
        int sum = 0;
        int r;

        // 1. Counting the digits
        while (temp > 0) {
            temp = temp / 10; // Removes the last digit
            count++;          // Same as count = count + 1
        }
        System.out.println("Digit Count = " + count);

        // Reset temp to the original number for the next calculation
        temp = n;

        // 2. Summing the digits
        while (temp > 0) {
            r = temp % 10;    // Gets the last digit (e.g., 3)
            sum = sum + r;    // Adds it to the sum
            temp = temp / 10; // Removes the last digit
        }
        System.out.println("Sum of Digits = " + sum);
    }
}