package corejavaprograms;
import java.util.*;

public class coretest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // Simple If-Else Logic
        if (a > b) {
            System.out.println("a is greater: " + a);
        } else {
            System.out.println("b is greater: " + b);
        }
        
     // Model 2 Logic: Checking for equality
        if (a > b) {
            System.out.println("a");
        } else if (a < b) {
            System.out.println("b");
        } else {
            System.out.println("Equal");
        }

	}

}
