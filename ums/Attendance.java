package corejavaprograms;
import java.util.*;

public class Attendance {
	// 1. Must initialize local variables to 0
     static int totalstudents_present = 0;
     static int totalteachers_present = 0;
    static void showattendancemenu() {
        Scanner Ac = new Scanner(System.in);
        
        

        System.out.println("\n--- Attendance Menu ---");
        System.out.println("Enter your choice: \n1. Students\n2. Teachers");
        int Achoice = Ac.nextInt();

        if(Achoice == 1) {
            System.out.println("Marking Attendance for Students (Enter 'y' for Present, 'n' for Absent):");
            for(int i = 0; i < Person.stdcount; i++) {
                if(Master.students[i] != null) {
                    System.out.print("Roll No: " + Master.students[i].rollno + " | Name: " + Master.students[i].name + ": ");
                    String status = Ac.next();
                    if(status.equalsIgnoreCase("y")) {
                        totalstudents_present++;
                    }
                }
            }
            System.out.println("\nTotal Students Present today: " + totalstudents_present);
        }
        else if(Achoice == 2) {
            System.out.println("Marking Attendance for Teachers:");
            for(int i = 0; i < Person.teachercount; i++) {
                if(Master.teachers[i] != null) {
                    System.out.print("ID: " + Master.teachers[i].idno + " | Name: " + Master.teachers[i].name + ": ");
                    String status = Ac.next();
                    if(status.equalsIgnoreCase("y")) {
                        totalteachers_present++;
                    }
                }
            }
            System.out.println("\nTotal Teachers Present today: " + totalteachers_present);
        }

        // Return to Menu
        System.out.println("\nReturning to Main Menu...");
        Person.displaymenu();
        int choice = Ac.nextInt();
        Person.handlechoice(choice);
    }
}