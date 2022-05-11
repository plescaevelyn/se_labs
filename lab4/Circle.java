package lab4;

public class Circle extends Shape{
    double radius;
    String color;
    private static final double PI = 3.1415;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return this.radius * PI;
    }
}
