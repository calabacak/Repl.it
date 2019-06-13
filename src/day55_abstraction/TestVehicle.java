package day55_abstraction;

public class TestVehicle {
	public static void main(String[] args) {
		
		Bike bike1= new Bike(2,1500);
		System.out.println(bike1.getPowerSource());
		bike1.move();
	}

}
