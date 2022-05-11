package lab2;

import java.util.Scanner;

public class Exercise1 {
	//variable initialisation
	Integer number1;
	Integer number2;
	Scanner scanner = new Scanner(System.in);
	
	public Exercise1() {
		//empty constructor
	}
	
	public Exercise1(Integer number1, Integer number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void valueInit(Integer number1, Integer number2) {
//		if (number1.equals(null) && number2.equals(null)) {
			System.out.println("Please give two numbers: ");
			this.number1 = scanner.nextInt();
			this.number2 = scanner.nextInt();	
//		}
	}
	
	public int maxOfNumbers(Integer number1, Integer number2) {
		if  (number1.equals(number2) || (number1 > number2)) {
			return number1;
		}
		return number2;
	}
	
	public void runExercise1() {
		valueInit(number1, number2);
		System.out.println("The maximum of these numbers is: " + maxOfNumbers(number1, number2));
	}
}
