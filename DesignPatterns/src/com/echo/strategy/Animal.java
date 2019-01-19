package com.echo.strategy;

public class Animal {
	public Walk walkType;  //using an interface type allows the subclasses to set the desired implementation

	public void setWalkType(Walk walkType) {   //subclass can use this to change the implementation
		this.walkType = walkType;
	}

	public String walk() {       //returns the selected implementation Walk interface
		return walkType.walk();   
	}
}
