package lab5;

import java.util.Random;

public class TemperatureSensor extends Sensor {
	public TemperatureSensor() {
		
	}

//	private TemperatureSensor() {
//		
//	}
	
	@Override
	public int readValue() {
		Random random = new Random();
		int value = random.nextInt(101);
		
		return value;	
	}
}
