package corejavaprograms;
import java.util.*;
public class coretest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Variable Declarations
        String bcode, bname;
        int bno;
        double bprice;
        float bpdisc;
        char bpcode;
        boolean bav;

        // Input using Scanner methods
        System.out.print("Enter Book Code: ");
        bcode = sc.next(); // Reads a single word

        System.out.print("Enter Book Number: ");
        bno = sc.nextInt(); // Directly reads an integer

        sc.nextLine(); // Consume leftover newline character
        System.out.print("Enter Book Name: ");
        bname = sc.nextLine(); // Reads the full line (multiple words)

        System.out.print("Enter Book Price: ");
        bprice = sc.nextDouble(); // Reads a double

        System.out.print("Enter Discount: ");
        bpdisc = sc.nextFloat(); // Reads a float

        System.out.print("Enter Price Code: ");
        // Scanner doesn't have nextChar(); we take the first letter of a string
        bpcode = sc.next().charAt(0); 

        System.out.print("Enter Availability (true/false): ");
        bav = sc.nextBoolean(); // Reads a boolean

        // Output Display
        System.out.println("\n-------------------------");
        System.out.println("\t BOOK DETAILS");
        System.out.println("-------------------------");
        System.out.println("Book Code:    " + bcode);
        System.out.println("Book Number:  " + bno);
        System.out.println("Book Name:    " + bname);
        System.out.println("Book Price:   " + bprice);
        System.out.println("Price Code:   " + bpcode);
        System.out.println("Availability: " + bav);
        System.out.println("Discount:     " + bpdisc);
        System.out.println("-------------------------");
        
        sc.close(); // Close scanner to free resources
	}

}
