package corejavaprograms;
import java.util.*;

public class coretest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
        
        // Displaying a menu
        System.out.println("------- Switch Case -------");
        System.out.println("1. Apple");
        System.out.println("2. Orange");
        System.out.println("3. Mango");
        System.out.println("---------------------------");
        
        System.out.print("Enter your choice (1-3): ");
        int i = sc.nextInt();

        // Switch logic
        switch (i) {
            case 1:
                System.out.println("Apple");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Mango");
                break;
            default:
                System.out.println("Invalid");
        }
        
        sc.close();

	}

}
