package dowhileloop;

public class Dwtest2 {

    public static void main(String[] args) {
        int i = 65;
    
        System.out.println("Output from do-while loop:");
        do {
            System.out.print((char)i + " ");
            i++;
        } while(i <= 90); 
        
        System.out.println("\n--------------------------");

        // RESET i to 65 so the next loop can run
        i = 65; 

        System.out.println("Output from while loop:");
        while(i <= 90) {
            System.out.print((char)i + " ");
            i++;
        }
        
        System.out.println("\n--------------------------");
        System.out.println("Output from for loop:");


        for(i=65;i<=90;i++) {
            System.out.print((char)i + " ");

        }
    }
}