package com.edurekaexception;

public class ExceptionsDemo {

	public static void main(String[] args) {
		int denominator1 = 1;
		int denominator0 = 0;
		int[] integerArray = {1,2,3,4};
		
		try {
			
			// throw keyword will print this message and then will go to finally code
			if(denominator0 == 0)	throw new CustomException("Devide by zero my custom new excpetion");
			
			System.out.println(10/denominator0);
			
			
			// This try will run if the last line of the code doens't has exceptions:
			try {
				System.out.println(integerArray[4]);	
			}catch(NullPointerException nullPointerException){
				System.out.println("Null Pointer Exception Handler");
			}
			
			
		}catch(ArithmeticException arithmeticExcepion) {
			System.out.println("Printing any kind of of arithmetic exception: " + arithmeticExcepion.getMessage());
		}catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Printing any kind of of ArrayIndexOutOfBoundsException exception: " + arrayIndexOutOfBoundsException.getMessage());
		}catch(Exception exception) {
			System.out.println("Generic exception: " + exception.getMessage());
			
		// Finally code will always run:
		}finally {
			System.out.println("Finally block under execution");
		}
		
	}
}
