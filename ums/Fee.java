package corejavaprograms;
import java.util.*;

public class Fee {

    // Method to display the general structure
    public static void showfeedetailsmenu() {
        Scanner Fc = new Scanner(System.in);
        System.out.println("\n--- College Fee Structure ---");
        System.out.println("1. Science Dept    : Rs.1,500");
        System.out.println("2. Arts Dept       : Rs.900");
        System.out.println("3. Technology Dept : Rs.3,000");
        
        System.out.println("\nEnter a course name to check specific fee (or type 'exit'):");
        String course = Fc.next();
        
        if(!course.equalsIgnoreCase("exit")) {
            int amount = getFeeByCourse(course);
            if(amount > 0) {
                System.out.println("The fee for " + course + " is: Rs" + amount);
            } else {
                System.out.println("Course not found.");
            }
        }

        // Return to main menu logic
        Person.displaymenu();
        System.out.print("Enter your choice: ");
        int choice = Fc.nextInt();
        Person.handlechoice(choice);
    }

    // Method to return the actual value (Helper Method)
    public static int getFeeByCourse(String course) {
        if (course == null) return 0;
        
        switch (course.toLowerCase()) {
            case "science": return 1500;
            case "arts": return 900;
            case "technology": return 3000;
            default: return 0;
        }
    }
}