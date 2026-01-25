package corejavaprograms;
import java.io.*;
import java.lang.*;

public class coretest6 {

	public static void main(String args[]) throws IOException {
        // Step 1: Connect the keyboard (System.in) to a Reader
        InputStreamReader isr = new InputStreamReader(System.in);
        
        // Step 2: Use BufferedReader for efficient reading
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Enter Your Name: ");
        String name = br.readLine(); // Reads a full line of text
        
        System.out.println("Name = " + name);
	}

}
