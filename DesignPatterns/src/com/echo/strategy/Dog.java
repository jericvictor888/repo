package com.echo.strategy;

public class Dog extends Animal{
	
	public Dog(){
		walkType = new WalkSlow(); 
	}
}
