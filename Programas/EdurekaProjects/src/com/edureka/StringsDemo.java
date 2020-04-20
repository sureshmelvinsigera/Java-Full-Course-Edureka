package com.edureka;

public class StringsDemo {

	public static void main(String[] args) {
		
		String s1 = "Edureka";
		String s2 = "EDureka";
		int aux = 10;
		
		System.out.println("Printing equality of strings: " + s1.equals(s2));
		System.out.println("Printing value of string: " + String.valueOf(aux));
		System.out.println("Printing replace of string: " + s2.replace('D','d'));
		System.out.println("Printing compare of strings: " + s1.compareTo(s2));
		System.out.println("Printing upper case of string: " + s1.toUpperCase());
		System.out.println("Printing length of string: " + s1.length());
		System.out.println("Printing substring of string: " + s1.substring(2));
	}
}
