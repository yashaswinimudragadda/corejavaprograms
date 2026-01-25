package corejavaprograms;
import java.io.*;

public class coretest8 {

	
		public static void main(String args[]) throws IOException {
	        // Initializing BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        // Variable declarations
	        String ecode, ename;
	        int eno;
	        double esal;
	        float epf;
	        char egrade;

	        // Reading and Parsing Input
	        System.out.print("Enter Ecode: ");
	        ecode = br.readLine();

	        System.out.print("Enter Eno: ");
	        eno = Integer.parseInt(br.readLine()); // Parsing String to int

	        System.out.print("Enter Ename: ");
	        ename = br.readLine();

	        System.out.print("Enter Esal: ");
	        esal = Double.parseDouble(br.readLine()); // Parsing String to double

	        System.out.print("Enter Epf: ");
	        epf = Float.parseFloat(br.readLine()); // Parsing String to float

	        System.out.print("Enter Egrade: ");
	        // Using read() and casting to char as noted in your parsing notes
	        egrade = (char) br.read(); 

	        // Displaying Employee Details
	        System.out.println("\n-------------------------");
	        System.out.println("\tEMPLOYEE DETAILS");
	        System.out.println("-------------------------");
	        System.out.println("Code   = " + ecode);
	        System.out.println("Number = " + eno);
	        System.out.println("Name   = " + ename);
	        System.out.println("Salary = " + esal);
	        System.out.println("PF     = " + epf);
	        System.out.println("Grade  = " + egrade);
	    }

	}


