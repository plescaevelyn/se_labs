package lab3;

public class Flower {
	int petal;
	static int numberOfObjects = 0;
	
    Flower(){ 
    	System.out.println("Flower has been created!");            
    	Flower.numberOfObjects++;
    }

    public static int howManyObjects() {
    	return Flower.numberOfObjects;
    }
    
    public static void main(String[] args) {
    	Flower[] garden = new Flower[5];
    	for(int i =0;i<5;i++){
    		Flower f = new Flower();
    		garden[i] = f;
    	}
    	
    	System.out.println(howManyObjects());
    }
}
