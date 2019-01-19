/**
 * Strategy Pattern Demo.
 * This design patter is used to be able to dynamically change 
 * the behavior of a method of a class.
 */
package com.echo.strategy;

public class Exec {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal horse = new Horse();
		
		System.out.println(dog.walk());     //Walks Slow...
		System.out.println(horse.walk());   //Walks Fast...
 
		dog.setWalkType(new WalkFast());    //change the walk implementation
		System.out.println(dog.walk());     //Walks Fast...
		
		horse.setWalkType(new WalkSlow());  //change the walk implementation
		System.out.println(horse.walk());   //walks Slow...
	}

}
