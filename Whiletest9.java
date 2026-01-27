package whileloops;

public class Whiletest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // The number for the multiplication table
        int i = 1;  // The counter

        while (i <= 10) {
            // Corrected concatenation: n + " * " + i + " = " + (n * i)
            System.out.println(n + " * " + i + " = " + (n * i));
            i = i + 1; // Increment the counter
        }

        System.out.println("----------");

	}

}
