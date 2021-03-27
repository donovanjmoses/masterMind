import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {
		// instantiate scanner object
		Scanner in = new Scanner(System.in);
		
		// declare variables
		int usersGuess;
		int secretNumber;
		int guessCount = 0;
		String playAgain;
		
		// this block of code determines the results for the player and prints it
		do {
			guessCount++;
			secretNumber = (int)(Math.random()*9000) + 1000;
			System.out.println("----- MASTERMIND -----");
			System.out.printf("Guess the 4 digit number!\n\n");
			usersGuess = in.nextInt();
			String secretNumberToString = Integer.toString(secretNumber);
			String usersGuessToString = Integer.toString(usersGuess);
			System.out.println("Guess " + guessCount + ": " + usersGuess);
			int matchedNumbers = 0;
			if (secretNumberToString.charAt(0) == usersGuessToString.charAt(0)) {
				matchedNumbers++;}
			if (secretNumberToString.charAt(1) == usersGuessToString.charAt(1)) {
				matchedNumbers++;}
			if (secretNumberToString.charAt(2) == usersGuessToString.charAt(2)) {
				matchedNumbers++;}
			if (secretNumberToString.charAt(3) == usersGuessToString.charAt(3)) {
				matchedNumbers++;}
			System.out.println("You matched " + matchedNumbers + "\n\n");
			if (usersGuessToString == secretNumberToString) {
			System.out.printf("You matched " + matchedNumbers + "\n\n" + "Congratulations! You guessed the right number in " + guessCount + " guesses." );}
			else if (usersGuess == secretNumber) {
			System.out.printf("You matched " + matchedNumbers + "\n\n" + "Congratulations! You guessed the right number in " + guessCount + " guesses." );}
			
			/* // working on future enhancements below
			// the player is prompted to play again by typing 'yes'
			System.out.println("Would you like to play again? Type 'yes' to continue:");
			 playAgain = in.next();
			if ((playAgain == "yes") || (playAgain == "Yes") || (playAgain == "y") || (playAgain == "Y")) {
				//startGame();
			} else if ((playAgain == "no") || (playAgain == "No") || (playAgain == "N") || (playAgain == "n")) {
				System.out.println("Thanks for playing!");
			} else {
				System.out.println("Please enter a valid response");
			} */
			}
			while (usersGuess != secretNumber);	
	}
	
}