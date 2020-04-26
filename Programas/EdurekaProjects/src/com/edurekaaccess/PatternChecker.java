package com.edurekaaccess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecker {

	public static void main(String[] args) {
		
		String stringToCheck = "Happy Learning in Edureka!!";
		
		String pattern1 = "[a-z]+";
		String pattern2 = "in";
		String pattern3 = "\\bin\\b";
		
		Pattern compiledPattern1 = Pattern.compile(pattern1);
		Pattern compiledPattern2 = Pattern.compile(pattern2);
		Pattern compiledPattern3 = Pattern.compile(pattern3);
		
		Matcher matcher1 = compiledPattern1.matcher(stringToCheck);
		Matcher matcher2 = compiledPattern2.matcher(stringToCheck);
		Matcher matcher3 = compiledPattern3.matcher(stringToCheck);
		
		
		while(matcher1.find()) {
			System.out.println("Pattern1 matches: " + stringToCheck.substring(matcher1.start(), matcher1.end()));
		}
		while(matcher2.find()) {
			System.out.println("Pattern2 matches: letters " + matcher2.group() + " at " + matcher2.start());
		}
		while(matcher3.find()) {
			System.out.println("Pattern3 matches: word " + matcher3.group() + " at " + matcher3.start());
		}
		
		
	}
	
}
