package com.echo.singleton;

public class Singleton {
	private static Singleton singleton;   
	
	private Singleton() {   //set constructor private to prevent instantiation via new keyword
		
	}
	
	public static Singleton getInstance() {     //static method can only call static methods or variable
		if(singleton == null) {
			singleton = new Singleton();       
		}
		
		return singleton;
	}
	
}
