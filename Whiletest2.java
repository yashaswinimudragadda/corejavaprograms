package whileloops;

public class Whiletest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialization
        int i = 1; // loop counter
        int c = 0; // count of numbers
        int s = 0; // sum of numbers

        while (i <= 5) {
            System.out.print(i + " ");
            s = s + i; // Adding current number to sum
            c = c + 1; // Incrementing the count
            i = i + 1; // Incrementing the counter
        }

        // Final Results
        System.out.println("\nsum = " + s);
        System.out.println("count = " + c);
        System.out.println("Average = " + (s / c));

	}

}
