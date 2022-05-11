package lab3;

//A class called Circle contains:
//
//Two private instance variables: radius (of type double) and color (of type String), with default value of 1.0 and �red�, respectively.
//Two overloaded constructors;
//Two public methods: getRadius() and getArea().
//Write a class which models the class Circle. Write a class TestCircle which test Circle class.

public class Circle {
	double radius;
	String color;
	
	private final double PI = 3.14;
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getArea() {
		return this.radius * PI;
	}
}
