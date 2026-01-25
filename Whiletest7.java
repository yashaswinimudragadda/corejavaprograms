package whileloops;
import java.util.*;

public class Whiletest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,i=1,f=1;
		System.out.println("number factorial");
		System.out.println("=====================");
		while(i<=n) {
			f=f*i;
			System.out.println(i+"\t"+f);
			i=i+1;
		}
		System.out.print("========================");

	}

}
