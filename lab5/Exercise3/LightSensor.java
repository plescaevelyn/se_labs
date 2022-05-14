package lab5.Exercise3;

import java.util.Random;

public class LightSensor extends Sensor {
	public LightSensor() {
		
	}

//	private LightSensor() {
//		
//	}
	
	@Override
	public int readValue() {
		Random random = new Random();
		int value = random.nextInt(101);
		
		return value;	
	}
}
