package corejavaprograms;

public class coretest4 {

	public static void main(String[] args) {
		// Variable Declarations
        String ecode = "E101";        // Employee Code
        int eno = 1;                  // Employee Number
        String ename = "Anil";        // Employee Name
        double esal = 4556.75;        // Salary (double is more precise than float)
        float epf = 3656.75f;         // Provident Fund (requires 'f' suffix)
        char egrade = 'A';            // Performance Grade
        boolean ews = true;           // Work Status (true for active)

        // Printing Employee Details
        System.out.println("...........");
        System.out.println("\t EMPLOYEE DETAILS"); // Fixed \t for Tab
        System.out.println("...........");
        
        System.out.println("Code = " + ecode);
        System.out.println("Number = " + eno);
        System.out.println("Name = " + ename);
        System.out.println("Salary = " + esal);
        System.out.println("Provident Fund = " + epf);
        System.out.println("Grade = " + egrade);
        System.out.println("Work Status = " + ews);
        System.out.println("...........");

	}

}
