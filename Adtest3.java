package Arrays;
import java.io.*;

public class Adtest3 {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		int a[], n, i;
        a = new int[100]; // Pre-allocating space for up to 100 elements
        
        // Setting up BufferedReader for input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array: ");
        n = Integer.parseInt(br.readLine()); // Converting input String to Integer

        // Loop to take input for each element
        for (i = 0; i < n; i++) {
            System.out.print("Enter value for index " + i + ": ");
            a[i] = Integer.parseInt(br.readLine()); //
        }

        // Loop to display the entered array
        System.out.println("\nThe Array Elements are:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t"); //
        }
        System.out.println(); // New line

	}

}
