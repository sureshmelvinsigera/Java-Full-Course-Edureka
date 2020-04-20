package com.edurekamodule3;

public class Bike extends Vehicle{
	
	Integer numberOfWheels;

	public void move() {
		System.out.println("Move in Bike class");
	}
	
	public void printNumberOfWheels() {
		System.out.println("\nStarting super keyword demo");
		numberOfWheels=2;
		System.out.println(numberOfWheels);
		System.out.println(super.numberOfWheels);
	}

}
