package corejavaprograms;
import java.io.*;

public class coretest7 {

	public static void main(String args[]) throws IOException {
        // Setting up the reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // 1. Reading and Parsing an Integer (Age)
        System.out.print("Enter Your Age: ");
        int age = Integer.parseInt(br.readLine()); 

        // 2. Reading and Parsing a Float (Salary)
        System.out.print("Enter Your Salary: ");
        float sal = Float.parseFloat(br.readLine());

        // 3. Reading and Parsing a Double (Big Decimal)
        System.out.print("Enter a Double value: ");
        double d = Double.parseDouble(br.readLine());

        // Displaying Results
        System.out.println("-------------------------");
        System.out.println("Age = " + age);
        System.out.println("Salary = " + sal);
        System.out.println("Double Value = " + d);
    }

}
