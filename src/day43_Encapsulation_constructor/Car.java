package day43_Encapsulation_constructor;

public class Car {
	
	private String make, model, price;
	
	public Car(String mmake, String model, String price) {
		
		make=mmake;
		this.model= model;
		this.price=price;
		
	}
	
	

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + "]";
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getMake() {
		return make;
	}



	public String getModel() {
		return model;
	}



	
	
	

}
