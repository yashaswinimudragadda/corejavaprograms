package corejavaprograms;
import java.util.*;

public class Master {
	static Person[] students = new Person[100];
    static Person[] teachers = new Person[100];
    static Person[] generals=new Person[100];
	
	
	static void showmastermenu() {
		Scanner mc = new Scanner(System.in);
		
		System.out.println("enter your details");
	    System.out.println();
	    System.out.println("please enter your name");
	    String name=mc.next();
	    System.out.println("please enter your email");
	    String email= mc.next();
	    System.out.println("please enter your role");
	    String role=mc.next();
	    System.out.println("please enterr your password it must in numbers only");
	    int pass=mc.nextInt();
	    System.out.println();
	    if(role.equalsIgnoreCase("student")) {
	    	System.out.print("Please enter your roll no: ");
	        int rollno = mc.nextInt();
	        System.out.println("Please enter your course: ");
	        String course=mc.next();
	        Person spc = new Person(pass, email, name, rollno, role, course);
	        students[Person.stdcount] = new Person(pass, email, name, rollno, role, course);
	        Person.stdcount++;
	        System.out.println("Student profile created.");
	          }
	    else if(role.equalsIgnoreCase("teacher")) {
	    	System.out.print("Please enter your ID no: ");
	        int idno = mc.nextInt();
	        System.out.println("Please enter your teachcourse: ");
	        String teachcourse=mc.next();
	        Person tpc = new Person(pass, email, name, idno, role,teachcourse);
	        teachers[Person.teachercount] = new Person(pass, email, name, idno, role,teachcourse);
	        Person.teachercount++;
	        System.out.println("Teacher profile created.");
	    }
	    else {
	        // Fallback for general person
	        Person pc = new Person(pass, name, email, role);
	        generals[Person.totalcount] = new Person(pass, email, name, role);
	        Person.totalcount++;
	        System.out.println("General profile created.");

		}
	    //=======================for testing
			
		 System.out.println();
		 System.out.println("\n--- Current Students List ---");
	        for (int i = 0; i <= Person.stdcount; i++) {
	            if (students[i] != null) {
	                System.out.println((i+1) + ". Name: " + students[i].name + " | Roll No: " + students[i].rollno);
	            }
	        }
	        System.out.println();
			 System.out.println("\n--- Current Teacher List ---");
		        for (int i = 0; i <= Person.teachercount; i++) {
		            if (teachers[i] != null) {
		                System.out.println((i+1) + ". Name: " + teachers[i].name + " | Roll No: " + teachers[i].rollno);
		            }
		        }
		   
		    Person.displaymenu();
		    System.out.println("enter your code .");
		    int choice=mc.nextInt();
		    Person.handlechoice(choice);// selecting the code to get details.
		   
	}

}

