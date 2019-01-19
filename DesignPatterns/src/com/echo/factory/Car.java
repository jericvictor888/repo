package com.echo.factory;

public abstract class Car {
	private int maxSpeed;
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void drive() {
		System.out.println("Driving " + getBrand() + " at " + getMaxSpeed() + " kph");
	}
		
}
