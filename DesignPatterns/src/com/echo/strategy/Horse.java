package com.echo.strategy;

public class Horse extends Animal{

	public Horse() {
		walkType = new WalkFast();
	}
}
