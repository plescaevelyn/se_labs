package lab2;

import java.util.Scanner;

public class Exercise3 {
//	Write a program which display prime numbers between A and B, where A and B are read from console. 
//	Display also how many prime numbers have been found.

	private Integer A;
	private Integer B;
	Scanner scanner = new Scanner(System.in);
	
	public Exercise3() {
	}
	
	public void getTheNumbers() {
		System.out.println("Please provide the two numbers: ");
		this.A = scanner.nextInt();
		this.B = scanner.nextInt();
	}
	
	public Boolean isPrime(Integer number) {
		if (number <= 1)
			return true;
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void checkPrimes() {
		getTheNumbers();
		if (A >= B) {
			Integer aux = A;
			A = B;
			B = aux;
		}
		
		Integer numberOfPrimeNumbers = 0;
		Integer counter = A;
		while (counter <= B) {
			if (isPrime(counter)) {
				System.out.print(counter + "\t");
				numberOfPrimeNumbers++;
			}
			
			counter++;
		}
		System.out.println("The number of prime numbers is: " + numberOfPrimeNumbers);
	}
}
