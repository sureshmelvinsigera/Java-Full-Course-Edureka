package com.edureka;

public class ConstructorDemo {
	
	int instanceVariable;
	
	/*
	 * Constructors: Is used to initialize the state of an
	 * object, must NOT have a return type and the name must
	 * be the same as the class name:
	 */
	
	ConstructorDemo(){
		instanceVariable = 200;
	}
	
	ConstructorDemo(int value){
		instanceVariable = value;
	}
	
	ConstructorDemo(int value1, int value2){
		instanceVariable = value1+value2;
	}
	
	ConstructorDemo(int value1, int value2, int value3){
		this(value1,value2);	// I decided to ignore the third paramater if someone use it
	}
	
	/*
	 * Method must have a return type, is used to expose
	 * the behaviour of an object and must NOT have the same
	 * name as the class name:
	 */
	
	public int subTwoNumbers(int a, int b) {
		int aux = a-b;
		return aux;
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo construcDemo1 = new ConstructorDemo();
		ConstructorDemo construcDemo2 = new ConstructorDemo(10);
		ConstructorDemo construcDemo3 = new ConstructorDemo(10,30);
		ConstructorDemo construcDemo4 = new ConstructorDemo(30,20,20);
		
		System.out.println("construcDemo1 instanceVariable: " + construcDemo1.instanceVariable);
		System.out.println("construcDemo2 instanceVariable: " + construcDemo2.instanceVariable);
		System.out.println("construcDemo3 instanceVariable: " + construcDemo3.instanceVariable);
		System.out.println("construcDemo4 instanceVariable: " + construcDemo4.instanceVariable);
		
		construcDemo1.instanceVariable = construcDemo1.subTwoNumbers(30,10);
		System.out.println("construcDemo1 instanceVariable: " + construcDemo1.instanceVariable);
		
	}

}
