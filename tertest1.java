package terminate;

public class tertest1 {

    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 10; i++) {
            if(i == 3) {
                System.out.println("Breaking at: " + i);
                break; // This exits the loop entirely
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop terminated.");
    }
}