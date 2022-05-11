package lab3;

public class TestCircle {
	public static void main(String args[]) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(3.1415);
		Circle circle3 = new Circle(67, "blueish yellow");
		
		System.out.println("The radius of circle1 which is default is " + circle1.getRadius() + " and its color is " + circle1.getColor());	
		System.out.println("The radius of circle2 is " + circle2.getRadius() + " and its color is " + circle2.getColor());	
		System.out.println("The radius of circle3 is " + circle3.getRadius() + " and its color is " + circle3.getColor());	
	
		System.out.println("The area of the first circle " + circle1.getArea());
	}
}
