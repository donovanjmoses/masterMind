//CSE110      : 75326
//ASSIGNMENT  : ASSIGNMENT04
//AUTHOR      : DONOVAN MOSES
//DESCRIPTION : MASTERMIND, A GAME OF NUMBER-GUESSING

import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			int usersGuess;
			int secretNumber;
			int guessCount = 0;
			String playAgain;
			System.out.println("----- MASTERMIND -----");
			
			do {
				guessCount++;
				secretNumber = (int)(Math.random()*9000) + 1000;
				startGame();
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
					System.out.printf("You matched " + matchedNumbers + "\n\n" + "Congratulations! You guessed the right number in " + guessCount + " guesses.\nWould you like to play again? (yes/no)?" );}
				else if (usersGuess == secretNumber) {
					System.out.printf("You matched " + matchedNumbers + "\n\n" + "Congratulations! You guessed the right number in " + guessCount + " guesses.\nWould you like to play again? (yes/no)?" );}
				playAgain = in.next();
				if (playAgain == "yes" || (playAgain == "Yes" || (playAgain == "y") || (playAgain == "Y"))) {
					startGame();
				}
			}
			while (usersGuess != secretNumber);
			
		
	}
	private static void startGame() {
		System.out.printf("Guess the 4 digit number!\n\n");
		}
	//end of startGame()
}