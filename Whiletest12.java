package whileloops;

public class Whiletest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, r, s = 0, t;
        t = n; // Save the original number

        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }

        if (t == s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
