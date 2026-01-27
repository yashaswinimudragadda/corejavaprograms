	package whileloops;

public class Whiletest8 {

	public static void main(String[] args) {
		int n = 10, i = 1, f = 1;

        // Table Header
        System.out.println("Number\tSquare\tFactorial");
        System.out.println("---------------------------");

        while (i <= n) {
            f = f * i; // Calculating factorial
            // Printing: Number, Square (i*i), and Factorial (f)
            System.out.println(i + "\t" + (i * i) + "\t" + f);
            i = i + 1; // Increment
        }
        
        System.out.println("---------------------------");

	}

}
