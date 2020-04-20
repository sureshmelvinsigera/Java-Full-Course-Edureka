package com.edureka;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		// Single dimensional array:
		//int [] array = new int[] {5,6,7};	//Declaration Method 1
		int[] array = {2,4,6,8,10};	//Declaration Method 2

		// Multi dimensional array:
		int [][] multidimensionalArray = {
			{1,2},
			{3,4},
			{5,6}
		};
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Size of first array in multidimensional array:" + multidimensionalArray[0].length);
	}

}
