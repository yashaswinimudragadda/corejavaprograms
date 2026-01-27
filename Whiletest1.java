package whileloops;
import java.util.*;

public class Whiletest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        
        // 1. Initialization: Start at 1
        int i = 1;

        // 2. Condition: Keep going as long as i is less than or equal to 5
        while (i <= 5) {
            System.out.println(i); // Print current value
            
            // 3. Increment: Add 1 to i each time the loop runs
            i = i + 1;
        }
        
        sc.close();
	}

}
