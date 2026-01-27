package Arrays;

public class Adtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20, 30, 40, 50}; // Shorthand initialization
        int max = a[0], min = a[0];

        // Using a.length makes the code work for any array size
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);

	}

}
