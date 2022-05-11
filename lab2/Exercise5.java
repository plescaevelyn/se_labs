package lab2;

import java.util.Random;

public class Exercise5 {
//	Write a program which generate a vector of 10 int elements, sort them using bubble sort method and then display the result.	
	int[] randomArray = new int[10];

	public Exercise5() {
		
	}
	
	private void initArray() {
		int counter = 0;
		Random random = new Random();
		
		while (counter < 10) {
			this.randomArray[counter] = random.nextInt();
		}
	}
	
	private void bubbleSort(int[] randomArray)
	{
       int size = this.randomArray.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
              if (this.randomArray[j] > this.randomArray[j+1]) {               
                      int aux = this.randomArray[j];
                      this.randomArray[j] = this.randomArray[j+1];
                      this.randomArray[j+1] = aux;              
            	  }
	}
	
	private void displayArray(int[] randomArray) {
		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(this.randomArray[i] + " ");
		}
	}
	
	public void runEx5() {
		initArray();
		bubbleSort(this.randomArray);
		displayArray(this.randomArray);
	}
}
