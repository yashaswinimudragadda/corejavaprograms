package corejavaprograms;

public class coretest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
        int c; // Temporary variable

        System.out.println("Original: a = " + a + ", b = " + b);
        System.out.println("-----------------------------------");

        // 1. Using a temporary variable
        c = a;
        a = b;
        b = c;
        System.out.println("1. Temp Var Swap:\ta = " + a + "\tb = " + b);

        // 2. Addition and Subtraction (Resetting a=10, b=20 first)
        a = 10; b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("2. Add/Sub Swap:\ta = " + a + "\tb = " + b);

        // 3. Multiplication and Division
        a = 10; b = 20;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("3. Mult/Div Swap:\ta = " + a + "\tb = " + b);

        // 4. Bitwise XOR
        a = 10; b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("4. XOR Swap:\ta = " + a + "\tb = " + b);

        // 5. Single Line Expression
        a = 10; b = 20;
        b = a + b - (a = b);
        System.out.println("5. Single Line:\ta = " + a + "\tb = " + b);

        System.out.println("-----------------------------------");
        
        // Basic Arithmetic Operations
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division (Quotient) = " + (a / b));
        System.out.println("Modulus (Remainder) = " + (a % b));
		
		

	}

}
