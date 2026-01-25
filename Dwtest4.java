package dowhileloop;

public class Dwtest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; // Outer loop counter
        do {
            int j = 1; // Initialize j outside the inner loop so 'while' can see it
            do {
                System.out.print("*");
                j++;
            } while (j <= 5); // Inner loop finishes printing one row
            
            i++;
            System.out.println(); // Moves to the next line after each row
        } while (i <= 5); // Outer loop repeats for 5 rows

	}

}
