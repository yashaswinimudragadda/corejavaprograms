package whileloops;
import java.util.Scanner;

public class Whiletest3 {


		@SuppressWarnings("unused") // Annotation from your notes to hide unused warnings
	    public static void main(String[] args) {
	        
	        // 1. Initialization: Start at 99
	        int i = 99;

	        // 2. Condition: Keep going as long as i is greater than or equal to 1
	        while (i >= 1) {
	            // Using \t for tab spacing as seen in your notes
	            System.out.println(i + "\t bottles of beer on the wall," +i+" bottles of beer.");
	            System.out.println("\t Take one down and pass it around, 98 bottles of beer on the wall.");
	            
	            // 3. Decrement: Subtract 1 from i each time the loop runs
	            i = i - 1;
	        }

	        // Final lines printed after the loop finishes
	        System.out.println("\tNo more bottles of beer on the wall, no more bottles of beer");
	        System.out.println("\tGo to the store and buy some more, 99 bottles of beer on the wall.");

	}

}
