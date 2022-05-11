package lab3;

public class TestMyPoint {
	public static void main(String args[]) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(15,15);
		
		System.out.println("Our first given point is " + point1.toString());
		System.out.println("Our second given point is " + point2.toString());
		
		System.out.println("The distance between these two points is " + point1.distance(point2));
		System.out.println("The distance between the first point which has the coordinates " + point1.toString() + "and a point with the coordinates"
				+ "(4,7) is " + point1.distance(4, 7));
		System.out.println("The distance between the second point which has the coordinates " + point2.toString() + "and a point with the coordinates"
				+ "(5,8) is " + point1.distance(5, 8));	
		
		point1.setX(1);
		System.out.println("After modifying it, our first given point is " + point1.toString());
		point1.setY(5);
		System.out.println("After modifying it, our first given point is " + point1.toString());
		
		point2.setXY(3, -3);
		System.out.println("After modifying it, our second given point is " + point2.toString());
	
		System.out.println("Now, the distance between these two points is " + point1.distance(point2));
	}
}
	
	
