package corejavaprograms;
import java.util.*;

public class Updatedetails {
	static void showupdatedetailsmenu() {
		Scanner Uc=new Scanner(System.in);
		System.out.println("updatedetails");
		 System.out.println();
		 System.out.println("1.update name\n2.change password\n3.update email\n4.deleting record");
		   System.out.println("enter the code based on what you wanted to change:");
		   int Uchoice=Uc.nextInt();
		   switch(Uchoice) {
		   case 1: updatename();
		   break;
		   case 2: changepassword();
		   break;
		   case 3: updateemail();
		   break;
		   case 4: deleterecord();
		   break;
		   }
		   
		    Person.displaymenu();
		    System.out.println("enter your code .");
		    int choice=Uc.nextInt();
		    Person.handlechoice(choice);// selecting the code to get details.

	}
	//======================================================================
	
	static void updatename() {
		Scanner Udc=new Scanner(System.in);
		String new_name;
		boolean found = false;
		System.out.println("enter the name you wanted to change: ");
		String cname=Udc.next();
		for (int i = 0; i < Person.stdcount; i++) {
	        if (Master.students[i] != null && cname.equalsIgnoreCase(Master.students[i].name)) {
	            System.out.println("Student record found. Enter new name: ");
	            Master.students[i].name = Udc.next();
	            System.out.println("Name updated successfully!");
	            found = true;
	            break; 
	        }
	    }
		if (!found) {
	        for (int i = 0; i < Person.teachercount; i++) {
	            if (Master.teachers[i] != null && cname.equalsIgnoreCase(Master.teachers[i].name)) {
	                System.out.println("Teacher record found. Enter new name: ");
	                Master.teachers[i].name = Udc.next();
	                System.out.println("Name updated successfully!");
	                found = true;
	                break;
	            }
	        }
	        
			}
		   
	    Person.displaymenu();
	    System.out.println("enter your code .");
	    int choice=Udc.nextInt();
	    Person.handlechoice(choice);// selecting the code to get details.
		
		
	}
	//================================================
	static void changepassword() {
		Scanner Udp=new Scanner(System.in);
		int new_pass;
		System.out.println("enter the password you wanted to change: ");
		int cpass=Udp.nextInt();
		for(int i=0;i<Person.totalcount;i++) {
			
		if(cpass==(Master.generals[i].pass)) {
			System.out.println("enter new password: ");
			new_pass=Udp.nextInt();
			Master.generals[i].pass= new_pass;
			System.out.println("Your New password is updated");
		}
		else {
			System.out.println("invaild entry");
		}
			}
		   
	    Person.displaymenu();
	    System.out.println("enter your code .");
	    int choice=Udp.nextInt();
	    Person.handlechoice(choice);// selecting the code to get details.
		
	}
	//======================================================================

	static void deleterecord() {
		Scanner dc=new Scanner(System.in);
		System.out.println("enter password to delete your record: ");
		int dpass=dc.nextInt();
		boolean found = false;
		for(int i=0;i<Person.totalcount;i++) {
			if(Master.generals[i].pass==dpass) {
				found=true;
				for(int j=i;j<Person.totalcount-1;j++) {
					Master.generals[j]=Master.generals[j+1];
				}
				Master.generals[Person.totalcount-1]=null;
				Person.totalcount--;
				System.out.println("your data successfully deleted");
				break;
		}
		}
		if(!found) {
			System.out.println("Invalid password");
		}
		   
	    Person.displaymenu();
	    System.out.println("enter your code .");
	    int choice=dc.nextInt();
	    Person.handlechoice(choice);// selecting the code to get details.

	}
	//==============================================
	static void updateemail() {
	    Scanner Ude = new Scanner(System.in);
	    System.out.println("Enter the current email you want to change: ");
	    String cEmail = Ude.next();
	    boolean found = false;

	    // Use Person.totalcount but add a null check
	    for (int i = 0; i < Person.totalcount; i++) {
	        
	        // Safety check to prevent NullPointerException
	        if (Master.generals[i] != null) {
	            
	            if (cEmail.equalsIgnoreCase(Master.generals[i].email)) {
	                System.out.println("Record Found! Enter your new email: ");
	                String new_email = Ude.next();
	                
	                // Fix: Update the email field, not the name
	                Master.generals[i].email = new_email; 
	                System.out.println("Success: Email updated to " + new_email);
	                
	                found = true;
	                break; // Exit loop once updated
	            }
	        }
	    }

	    if (!found) {
	        System.out.println("Error: No record found with that email.");
	    }

	    // Do NOT call handlechoice here to prevent StackOverflow
	    System.out.println("Returning to menu...");
	}
	//==================================================
	   
}
