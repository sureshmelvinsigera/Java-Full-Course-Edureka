package com.edureka;

/*
 * Calculator is the class
 * add is a Method of Calculator class
 * 
 */

public class Calculator {
		
	public Integer add (Integer arg1, Integer arg2){
		Integer result = arg1+arg2;
		return result;
	}//Non static function
	
	public Integer add (Integer arg1, Integer arg2, Integer arg3){
		Integer result = arg1+arg2+arg3;
		return result;
	}//Non static function

	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Integer result_1 = cal.add(10,15);
		Integer result_2 = cal.add(10,15,20);
		System.out.println("The result_1 is: " + result_1);
		System.out.println("The result_2 is: " + result_2);
	}
}
