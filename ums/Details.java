package corejavaprograms;
import java.util.*;

public class Details {
    static void showdetailsmenu() {
        Scanner Dc = new Scanner(System.in);
        System.out.println("Select list to view:");
        System.out.println("1. Student Details\n2. Teacher Details\n3. General Details");
        
        int Dchoice = Dc.nextInt();

        if (Dchoice == 1) {
            System.out.println("\n--- Current Students List ---");
            for (int i = 0; i <= Person.stdcount; i++) {
                if (Master.students[i] != null) {
                    // Accessing name and rollno for students
                    System.out.println((i + 1) + ". Name: " + Master.students[i].name + 
                                       " | Roll No: " + Master.students[i].rollno);
                }
            }
        }
        else if (Dchoice == 2) {
            System.out.println("\n--- Current Teachers List ---");
            for (int j= 0; j <= Person.teachercount; j++) {
                if (Master.teachers[j] != null) {
                    // Accessing name and idno for teachers
                    System.out.println((j + 1) + ". Name: " + Master.teachers[j].name + 
                                       " | ID No: " + Master.teachers[j].idno);
                }
            }
        } 
        else {
            System.out.println("\n--- Current General List ---");
            for (int k = 0; k <= Person.totalcount; k++) {
                if (Master.generals[k] != null) {
                    // General members only show name and email
                    System.out.println((k + 1) + ". Name: " + Master.generals[k].name + 
                                       " | Email: " + Master.generals[k].email);
                }
            }
        }

        // Return to Menu Logic
        System.out.println("\nReturning to Main Menu...");
        Person.displaymenu();
        int choice = Dc.nextInt();
        Person.handlechoice(choice);
    }
}