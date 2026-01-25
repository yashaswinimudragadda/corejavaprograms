package corejavaprograms;
import java.util.*;

public class coretest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // Nested If Logic
        if (x >= 0) {
            if (x == 0) {
                System.out.println("zero");
            } else {
                System.out.println("positive");
            }
        }
        else {
        	System.out.println("negative");
        }
        
        sc.close();

	}

}
