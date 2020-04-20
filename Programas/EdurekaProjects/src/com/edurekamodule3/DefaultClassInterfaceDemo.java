package com.edurekamodule3;

interface Welcome{
	
	// Default method:
	default void say() {
		System.out.println("Hello, you're using a default method");
	}
	
	// Abstract method:
	void hello(String msg);
}

public class DefaultClassInterfaceDemo implements Welcome{

	// We've to implement the abstract method:
	public void hello(String msg) {
		System.out.println("You're using the abstract method: " +	 msg);
	}
	
	public static void main(String[] args) {
		
		DefaultClassInterfaceDemo out = new DefaultClassInterfaceDemo();
		out.say();
		out.hello("Olá");
	}
	
}
