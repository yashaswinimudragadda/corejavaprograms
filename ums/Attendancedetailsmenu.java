package corejavaprograms;
import java.util.*;

public class Attendancedetailsmenu {
    static void showattendancedetailsmenu() {
        Scanner Adc = new Scanner(System.in);
        System.out.println("attendancedetailsmenu");
        System.out.println("\nenter the code for getting attendance details \n 1. student \n 2. teacher");
        int choice = Adc.nextInt();

        if (choice == 1) {
            System.out.println("----------------------------------------");
            System.out.println("        Student Attendance Details       ");
            System.out.println("----------------------------------------");
            
            // Use Person.stdcount to only loop through registered students
            for (int i = 0; i < Person.stdcount; i++) {
                // IMPORTANT: Always check if the object is NOT null
                if (Master.students[i] != null) {
                    System.out.println("Roll No: " + Master.students[i].rollno + " | Name: " + Master.students[i].name + " | Status: Present");
                }
            }
        } 
        else if (choice == 2) {
            System.out.println("----------------------------------------");
            System.out.println("        Teacher Attendance Details       ");
            System.out.println("----------------------------------------");
            
            for (int i = 0; i < Person.teachercount; i++) {
                if (Master.teachers[i] != null) {
                    System.out.println("ID: " + Master.teachers[i].idno + " | Name: " + Master.teachers[i].name + " | Status: Present");
                }
            }
        }

        System.out.println("\nReturning to menu...");
        Person.displaymenu();
        int nextChoice = Adc.nextInt();
        Person.handlechoice(nextChoice);
    }
}