package com.echo.factory;

public class CarFactory {
	public Car getInstance(String carModel) {

		if(carModel.equalsIgnoreCase("F")) {
			return new Ferrari();
		
		}else if(carModel.equalsIgnoreCase("B")) {
			return new BMW();

		}else if(carModel.equalsIgnoreCase("H")){
			return new Honda();
		
		}else {
			return null;
		
		}
	}
}
