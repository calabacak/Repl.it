package day55_abstraction;

public class Sailboat extends Vehicle{

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Sailboat(double price, int length) {
		super(0, price, "Sailboat", "Wind");
		this.length= length;
	}

	@Override
	public void move() {
		System.out.println("Sails...");
	}
	
	

}
