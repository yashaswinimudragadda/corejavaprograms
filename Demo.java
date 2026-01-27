package number_guessing;
import java.util.*;


public class Demo {

	//static variable to keep track of total wins across multiple games.

	static int total_wins =0;
	public static void guessingNumberGame() {
		Scanner sc=new Scanner(System.in);
		//Generate random number between 1 to 100.
		int number = 1+(int)(100*Math.random());
		
		
		//maximum number of attempts allowed.
		
		int k=5;
		boolean hasWon = false;
		System.out.println("\n--------New game started-----------");
		System.out.println("A number is chosen between 1 to 100.");
		System.out.println("you have "+k+" attempts to guess it.");
		
		
		//loop for player's attempts.
		
		for(int i=1;i<=k;i++) {
			System.out.print("Attempt "+i+" : enter your guess: ");
			int guess=sc.nextInt();
			
			//check if the guess is correct, lower or higher.
			
			if(guess==number) {
				System.out.println("congralations! you guessed the correct number.");
				 total_wins++; //increment score.
				hasWon=true;
				break;//exit the loop early since they won.
			}
			
			else if(guess<number) {
				System.out.println("the number is greater than"+guess);
			}
			else {
				System.out.println("the number is less than "+guess);
			}
		}
		//if the player uses all attempts without winning .
		
		if(!hasWon) {
			System.out.println("you've exhaused all attempts.");
			System.out.println("the corret number was: "+number);
		}
		
		//display the current session score.
		
		System.out.println("your total wins: "+total_wins);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ms = new Scanner(System.in);
		String choice;
		
		//use a so while loop to allow the player to play multiple rounds.
		
		do {
			guessingNumberGame(); //call the game method.
			System.out.print("\n so you want to play another round ? (yes/no)");
			choice= ms.next();
		}while(choice.equalsIgnoreCase("yes"));  //continue if user says "yes"
		
		System.out.println("\n thanks for playing! final score: "+total_wins);
		
		ms.close();
		

	
		
	}

}
