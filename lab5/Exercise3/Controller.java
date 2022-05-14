package lab5.Exercise3;

public class Controller {
	TemperatureSensor tempSensor = new TemperatureSensor();
	LightSensor lightSensor = new LightSensor();

//	static TemperatureSensor tempSensor;
//	static LightSensor lightSensor;
	
	public void control() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("temperature detected: " + tempSensor.readValue());
			System.out.println("light detected: " + lightSensor.readValue());
		
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void main() {
		control();
	}
}
