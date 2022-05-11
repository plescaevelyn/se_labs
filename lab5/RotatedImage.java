package lab5;

public class RotatedImage implements Image {
	private String filename;
	
	public RotatedImage() {
		
	}
	
	public RotatedImage(String filename) {
		this.filename = filename;
	}
	@Override
	public void display() {
		System.out.println("Display rotated " + this.filename);
	}
}
