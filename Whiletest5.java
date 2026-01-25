package whileloops;

public class Whiletest5 {
    public static void main(String[] args) {
        int n = 153;
        int originalN = n; // Save the original number
        
        // 1. Get the last digit using modulus
        int l = n % 10; 
        
        // 2. Find the first digit
        int f = n; 
        while (f >= 10) { 
            f = f / 10; // Keep dividing until only one digit remains
        }

        System.out.println("First digit: " + f);
        System.out.println("Last digit: " + l);

        // 3. Compare them
        if (f == l) {
            System.out.println(originalN + " is a cyclo-number");
        } else {
            System.out.println(originalN + " is not a cyclo-number");
        }
    }
}