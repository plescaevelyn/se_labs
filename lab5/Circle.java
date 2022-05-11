package lab5;

public class Circle extends Shape{
	public static final double PI = 3.14;
	double radius;

	public Circle() {
		super();
		this.radius = 1;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return PI*Math.pow(radius,2);
	}

	@Override
	double getPerimeter() {
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
