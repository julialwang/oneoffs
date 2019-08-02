//Julia Wang
//APCS Period 1

// a guessing game where the user has to guess a number that the computer has randomly generated.

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
	// calls all the other methods to play game and tracks overall results
		int totalGames = 1;
		int totalGuesses = 0;
		int guesses = guesses();
		totalGuesses += guesses;
		int bestGame = guesses;

		while(playAgain()) {
			totalGames++;
			guesses = guesses();
			totalGuesses += guesses;

			if(guesses < bestGame) {
				bestGame = guesses;
			}
		}
		results(totalGames, totalGuesses, bestGame);

	}
	
	public static int guesses() {
		
		// initializes scanner, generates random number, and asks for first guess
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100)+1;
		int distance1 = 0;
		int distance2 = 0;
		System.out.println("I'm thinking of a number between 1 and 100...");
		System.out.println("Your guess?");
		
		// asks for new input until number is an integer
		while (!console.hasNextInt()) { 
			console.next(); 
			System.out.println("Your guess was not a whole number between 1 and 100.");
			System.out.println("Your guess?"); 
		}
		
		int guess = console.nextInt();
		
		// asks for new input until input is valid
		while (guess > 100 || guess <= 0) { 
			System.out.println("Your guess was not a whole number between 1 and 100.");
			System.out.println("Your guess?"); 

			while (!console.hasNextInt()) { 
				console.next(); 
				System.out.println("Your guess was not a whole number between 1 and 100.");
				System.out.println("Your guess?"); 
			}
			guess = console.nextInt(); 
			distance1 = Math.abs(number - guess);
		}
		int counter = 1;
		
		// repeats until user guesses correct number 
		while(number != guess) {
			
			// tells user if their guess is higher or lower than the target number
			if(number > guess) {
				System.out.println("It's higher.");
			}
			else {
				System.out.println("It's lower.");
			}
			
			// tells user if their guess is further from the correct number than their previous guess
			if(distance1 > distance2) {
				System.out.println("Your guess was further from the target number.");
			}
			distance2 = distance1;
			
			// asks for a new guess
			System.out.println("Your guess?");
			while (!console.hasNextInt()) { 
				console.next(); 
				System.out.println("Your guess was not a whole number between 1 and 100");
				System.out.println("Your guess?"); 
			}
			guess = console.nextInt();
			distance1 = Math.abs( ) ;
			
			while (guess>100 || guess<=0) { 
				System.out.println("Your guess was not a whole number between 1 and 100");
				System.out.println("Your guess?"); 
				while (!console.hasNextInt()) { 
					console.next(); 
					System.out.println("Your guess was not a whole number between 1 and 100");
					System.out.println("Your guess?"); 
				}
				guess = console.nextInt(); 
				distance1 = Math.abs( ) ;
			}
			
			counter++;
		}
		
		// tells the user how many guesses they took 
		System.out.println("You guessed in " + counter + " guesses!");
		return counter;
	}
	
	public static boolean playAgain() {
	// asks user if they want to play again
		Scanner console = new Scanner(System.in);
		System.out.println("Play again?");
		String response = console.next();
		return (response.charAt(0) == 'y' || response.charAt(0) == 'Y'); 
	}
	
	public static void results(int totalGames, int totalGuesses, int bestGame) {
	// prints overall game results
		System.out.println();
		System.out.println("Your overall results:");
		System.out.println("Total games = " + totalGames);
		System.out.println("Total guesses = " + totalGuesses);
		System.out.println("Guesses / game = " + (double) totalGuesses / (double) totalGames);
		System.out.println("Best game = " + bestGame);
	}

}
