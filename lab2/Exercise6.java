package lab2;

import java.util.Scanner;

public class Exercise6 {
//	Being given an integer number N, compute N! using 2 methods:
//		a non recursive method
//		a recursive method
	Scanner scanner = new Scanner(System.in);
	int N;
	
	public Exercise6() {
	}

	private void getTheNumber() {
		System.out.println("Please provide the number whose factorial you want to compute: ");
		this.N = scanner.nextInt();
	}
	
	private int nonRecursive(int N) {
		int p = 1;
		for (int i = 2; i <= N; i++) {
			p *= i;
		}
		return p;
	}
	
	private int recursive(int N) {
		if (N <= 1) {
			return 1;
		}
		return N * recursive(N-1);
	}
	
	public void runEx6() {
		getTheNumber();
		
		System.out.println("The non-recursive factorial of " + N + " is " + nonRecursive(N));
		System.out.println("The recursive factorial of " + N + " is " + recursive(N));		
	}
}
