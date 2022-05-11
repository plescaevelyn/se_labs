package lab2;

import java.util.Scanner;

public class Exercise4 {
//	Giving a vector of N elements, display the maximum element in the vector.
	int size;
	Integer[] myVector;
	Scanner scanner = new Scanner(System.in);
	
	public Exercise4() {
	}
	
	public void getVectorElements() {
		int counter = 0;

		System.out.println("What is the size of your vector? ");
		
		size = scanner.nextInt();
		
		myVector = new Integer[size];
		
		while (counter < size) {
			myVector[counter] = scanner.nextInt(); 
			counter++;
		}
	}
	
	public Integer max(Integer[] myVector, Integer size) {
		int max = -1;
		
		for (Integer i = 0; i < size; i++) {
			if (myVector[i] >= max) {
				max = myVector[i];
			}
		}
		return max;
	}

	public void runEx4() {
		getVectorElements();
		System.out.println("The maximum element of the vector is: " + max(myVector, size));
	}
}
