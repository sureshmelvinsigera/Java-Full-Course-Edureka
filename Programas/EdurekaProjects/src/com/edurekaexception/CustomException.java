package com.edurekaexception;

public class CustomException extends Exception{

	CustomException(String s){
		super(s);
	}
	CustomException(Exception e){
		super(e);
	}
}
