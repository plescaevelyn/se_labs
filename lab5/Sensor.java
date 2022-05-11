package lab5;

public abstract class Sensor {
	String location;
	
	abstract int readValue();
	
	public String getLocation() {
		return this.location;
	}
}
