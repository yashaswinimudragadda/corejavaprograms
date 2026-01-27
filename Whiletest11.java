package whileloops;

public class Whiletest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153; // Original number
        int r, s = 0;
        int original = n; // Keep a copy if you need to compare later

        while (n > 0) {
            r = n % 10;      // 1. Get the last digit (3, then 5, then 1)
            s = s * 10 + r;  // 2. Build the reversed number
            n = n / 10;      // 3. Remove the last digit
        }

        System.out.println("Reverse = " + s);

	}

}
