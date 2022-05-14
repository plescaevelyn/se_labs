package lab5.Exercise1;

public class Square extends Rectangle {
	public Square() {
		super();
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public Square(double side) {
		super(side, side);
	}

	public double getSide() {
		return super.getLength();
	}

	public void setSide(double width) {
		super.setLength(length);
		super.setWidth(width);
	}
	
	

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
	}

	@Override
	public void setLength(double length) {
		super.setLength(length);
	}

	@Override
	public String toString() {
		return "Square [side=" + super.length + "]";
	}
}
