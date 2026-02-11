package corejavaprograms;
import java.util.*; 


public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
    System.out.println();	
	Person.collegename="college of art and science";
	System.out.println();
    Person.stdcount=0;
    Person.teachercount=0;
    Person.totalcount=0;
    Scanner Mc=new Scanner(System.in);
    System.out.println();
    Person.displaymenu();
    System.out.println("enter your code .");
    int choice=Mc.nextInt();
    Person.handlechoice(choice);// selecting the code to get details. 

}
}
