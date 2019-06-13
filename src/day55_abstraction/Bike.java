package day55_abstraction;

public class Bike extends Vehicle{

	public Bike(int wheels, double price) {
		super(wheels, price, "Bicycle", "a person");
	}

	@Override
	public void move() {
		System.out.println("Cycling...");
		
	}

}
