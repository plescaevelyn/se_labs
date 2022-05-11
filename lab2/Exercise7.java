package lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
//	Write a �Guess the number� game in Java. Program will generate a random number and will ask the user to guess it. 
//	If the user guesses the number, the program will stop. If the user does not guess it the program will display: 
//		'Wrong answer, your number it too high' or 'Wrong answer, your number is too low'. 
//		Program will allow user maximum 3 retries, after which the program will stop with the message 'You lost'.

	Random random = new Random();
	Integer randomNumber = random.nextInt(11);
	Scanner scanner = new Scanner(System.in);

	public Exercise7() {}
	
	int guess = 3;

	public void runEx7() {
		System.out.println("Guess the numbers!");
		
		while (guess >= 1) {
			System.out.println("Take a guess! What number do we have?");
			Integer userGuess = scanner.nextInt();
			
			if (userGuess.equals(randomNumber)) {
				System.out.println("Totally right! You won!");
				break;
			}
			else if (userGuess < randomNumber) {
				guess--;
				System.out.println("Wrong answer, your number is too low! " + guess + " guesses left");
			}
			else {
				guess--;
				System.out.println("Wrong answer, your number is too high! " + guess + " guesses left");
			}
		}
		
		if (guess == 1) {
			System.out.println("You lost! The number was " + randomNumber);
		}
	}
}
