package Arrays;

public class Adtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration and instantiation
        int a[] = new int[5];
        
        // Initialization
        a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;

        // Printing a specific element
        System.out.println("Element at index 2: " + a[2]);

        // Using a for-each loop to print all elements
        System.out.print("Array elements: ");
        for (int x : a) {
            System.out.print(x + "\t");
        }

	}

}
