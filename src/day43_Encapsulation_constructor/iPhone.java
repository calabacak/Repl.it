package day43_Encapsulation_constructor;

public class iPhone {

	private String model;
	private String color;
	private double price;

	public iPhone() {

	}

	public iPhone(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;

	}

	public String toString() {
		return "iPhone [model=" + model + ", color=" + color + ", price=" + price + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		switch (color) {
			case "Gray":
			case "Space Gray":
			case "Black":
			this.color = color;
			break;
		default:
			System.out.println("invalid color");
			this.color = "unknown";
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
