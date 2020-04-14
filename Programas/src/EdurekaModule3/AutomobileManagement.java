package edurekaModule3;

public class AutomobileManagement {

	public static void main(String[] args) {
		
		Car mercedes = new Car();
		Car bmw = new Car();
		mercedes.numberOfWheels = 4;
		bmw.numberOfWheels = 4;
		
		
		// Super keyword demo:
		Bike r1 = new Bike();
		Bike ducati = new Bike();
		ducati.printNumberOfWheels();
		
		
		// Polymorthism Demo:
		System.out.println("\nStarting polymorthism demo:");
		
		Car ferrari = new Car();
		Vehicle vehicle1 = ferrari;
		Vehicle vehicle2 = new Vehicle();
		vehicle1.move();
		vehicle2.move();
		
	}
}
