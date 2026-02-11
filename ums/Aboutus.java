package corejavaprograms;
import java.util.*;

public class Aboutus {

    static void aboutus() {
        Scanner Abtc = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.println("       COLLEGE OF ART AND SCIENCE");
        System.out.println("          Established: 1995");
        System.out.println("==============================================");
        System.out.println("\nMISSION:");
        System.out.println("To provide quality education in the fields of");
        System.out.println("Arts and Science, fostering innovation and");
        System.out.println("academic excellence.");
        
        System.out.println("\nDEPARTMENTS:");
        System.out.println("- Department of Physics & Chemistry");
        System.out.println("- Department of Literature & History");
        System.out.println("- Department of Technology");
        
        System.out.println("\nCONTACT US:");
        System.out.println("Email: contact@collegeartscience.edu");
        System.out.println("Phone: +91 9876543210");
        System.out.println("==============================================");
        
        // Pause to let the user read
        System.out.println("\nPress 'C' and Enter to continue...");
        Abtc.next(); 
        
        System.out.println();
        Person.displaymenu();
        System.out.println("Enter your code.");
        int choice = Abtc.nextInt();
        Person.handlechoice(choice);
    }
}