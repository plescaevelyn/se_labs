package lab3;

//A class called MyPoint, which models a 2D point with x and y coordinates contains:
//
//Two instance variables x (int) and y (int).
//A �no-argument� (or �no-arg�) constructor that construct a point at (0, 0).
//A constructor that constructs a point with the given x and y coordinates.
//Getter and setter for the instance variables x and y.
//A method setXY() to set both x and y.
//A toString() method that returns a string description of the instance in the format �(x, y)�.
//A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates.
//An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance another.
//Write the code for the class MyPoint. Also write a test class (called TestMyPoint) to test all the methods defined in the class.

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public int distance(int x, int y){
        return (int) Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }
    
    public int distance(MyPoint anotherPoint) {
		return (int) Math.sqrt(Math.pow((anotherPoint.getX()-this.x),2)+Math.pow((anotherPoint.getY()-this.y),2));
    }

    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        System.out.println("nothing");
    }
}
