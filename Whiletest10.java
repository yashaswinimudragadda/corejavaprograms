package whileloops;

public class Whiletest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, r, s = 0, t;
        t = n; // Store original number in 't'

        while (n > 0) {
            r = n % 10;      // Get the last digit
            s = s + (r * r * r); // Cube it and add to sum
            n = n / 10;      // Remove the last digit
        }

        if (t == s) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }

	}

}
