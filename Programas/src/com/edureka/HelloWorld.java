package com.edureka;

public class HelloWorld {

	Integer instanceVariable;	// Instance variable example (one per object)
	static Integer staticVariable=30;	// Static variable example (one per class)
	
	// Private non static you have access only in this package and you need the "new" function
	private void privateNonStaticTest() {
		Integer localVariable=20;	// Local variable example
		System.out.println("Non Static Method!");
	}
	
	// Public non static you have access in everywhere, but you still needing the "new" function
	public void publicNonStaticTest() {
		System.out.println("Non Static Method!");
	}
	
	// Public static you don't need object or variables which it belongs
	public static void staticTest() {
		System.out.println("Static Method!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		HelloWorld helloWorldObject1 = new HelloWorld();
		helloWorldObject1.privateNonStaticTest();
		helloWorldObject1.instanceVariable=40;
		
		HelloWorld helloWorldObject2 = new HelloWorld();
		helloWorldObject2.instanceVariable=30;
		
		HelloWorld.staticVariable=100;
		
		staticTest();	
	}
}
