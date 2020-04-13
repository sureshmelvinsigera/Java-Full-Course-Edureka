package EdurekaModule3;

public class AutomobileManagement {

	public static void main(String[] args) {
		
		Car mercedes = new Car();
		Car bmw = new Car();
		mercedes.numberOfWheels = 4;
		bmw.numberOfWheels = 4;
		
		Bike r1 = new Bike();
		Bike ducati = new Bike();
		r1.numberOfWheels = 2;
		ducati.numberOfWheels = 2;
		
		bmw.move();
		ducati.move();
		
	}
}
