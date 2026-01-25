package corejavaprograms;
import java.util.*;

public class coretest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        
        // name = sc.next();       // Reads only a single word
        String name = sc.nextLine(); // Reads the entire sentence

        System.out.println("Name = " + name);
        
        sc.close(); // Good practice to close the scanner

	}

}
