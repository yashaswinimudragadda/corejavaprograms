package Arrays;
import java.io.*;

public class Adtest4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[100];
        int n, max, min, sum = 0, count = 0;

        System.out.print("Enter size: ");
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            a[i] = Integer.parseInt(br.readLine());
        }

        max = min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
            sum += a[i];
            count++;
        }

        System.out.println("Max: " + max + " | Min: " + min);
        System.out.println("Avg: " + (sum / count) + " | Total Count: " + count);
	}

}
