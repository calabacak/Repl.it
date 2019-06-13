package MyMentoring;

public class CarEncapsulate {

	private String brand;
	private String model;
	private String color;
	private int numOfDoors;

//	public Car() {
//		System.out.println("No args-Construcor");
//	}

	public CarEncapsulate(String brand, String model, String color, int numOfDoors) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.numOfDoors = numOfDoors;
		//setNumOfDoors(numOfDoors);

	}

	public CarEncapsulate(String model, int numOfDoors) {
		this.brand = model;
		this.numOfDoors = numOfDoors;
	}

	//
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setNumOfDoors(int numOfDoors) {
		if(numOfDoors==2 || numOfDoors==4) {
			this.numOfDoors = numOfDoors;
		}
		else {
			System.out.println("WARNING YOUR INPUT IS NOT VALID, THIS FIELD CAN ONLY ACCEPT 2 OR 4");
			this.numOfDoors=-1;
		}
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

//	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", numOfDoors=" + numOfDoors + "]";
	}

}
