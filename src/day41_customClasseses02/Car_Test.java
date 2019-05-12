package day41_customClasseses02;

public class Car_Test {
	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		car1.make = "Toyota";
		car1.currentSpeed= 55;
		car1.model="Coralla";
		car1.color="Green";
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(70);
		car1.drive();
		car1.accellerate(10);
		System.out.println(car1.currentSpeed);
	}

}
