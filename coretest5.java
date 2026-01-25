package corejavaprograms;
import java.io.*;
import java.lang.*;

public class coretest5 {

	public static void main(String args[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.print("Enter Your Name: ");
        @SuppressWarnings("deprecation")
        String name = dis.readLine(); // This method is deprecated
        
        System.out.println("Name = " + name);
	}

}
