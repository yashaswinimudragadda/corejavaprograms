package whileloops;
import java.util.*;

public class Whiletest13 {
	public static void main(String[] args) {
        int num, i = 2;
        boolean flag = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Prime logic starts here
        if (num <= 1) {
            flag = true; // 0 and 1 are not prime
        } else {
            while (i <= num / 2) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
                ++i;
            }
        }

        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
