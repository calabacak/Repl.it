package day41_customClasseses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;
	
	
	public void printCarInfo() {
		
		System.out.println("make [" + make +"], model[" + model + "], color["+color+"], current speed["+currentSpeed+"]");
	}
	
	public void showCurrentSpeed(int speedLimit) {

		if(currentSpeed>speedLimit) {
			System.out.println(make + "is driving at " + currentSpeed+ "mph, over speed limit "+speedLimit );
		}else {
			System.out.println(make + " is driving at " + currentSpeed+ "mph, following the speed limit "+speedLimit );
		}
		
	}
	
	public void drive() {
		System.out.println(make+" "+ model+ " is driving");
	}
	
	public void accellerate(int mph) {
		currentSpeed=currentSpeed+mph;
		
	}

}
