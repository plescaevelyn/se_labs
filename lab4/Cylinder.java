package lab4;

public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return 0.0; //length * width * height
    }
}
