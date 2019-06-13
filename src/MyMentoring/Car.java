package MyMentoring;

public class Car {
	String brand;
	String model;
	String color;
	int numOfDoors;
	
	
	
//	public Car() {
//		System.out.println("No args-Construcor");
//	}
	
	public Car(String brand, String model, String color, int numOfDoors) {
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.numOfDoors=numOfDoors;
		
	}
	
	// model and car can be default
	
	public Car(String model,int numOfDoors) {
		this.brand=model;
		this.numOfDoors=numOfDoors;
	}
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", numOfDoors=" + numOfDoors + "]";
	}
	
	
	

}
