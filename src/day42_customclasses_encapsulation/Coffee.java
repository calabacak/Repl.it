package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;

	public void getCoffeeInfo() {
		String info = name.toUpperCase() + "  " + size.toUpperCase() + " $" + price + " " + calories + " CAL";
		System.out.println(info);
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("TALL") || newSize.equalsIgnoreCase("GRANDE")
				|| newSize.equalsIgnoreCase("VENTI")) {
			size = newSize;
		} else {
			System.out.println("ERROR: INVALID Size - " + newSize);
			size = "UNKNOWN";
		}

	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCAl) {
		setName(newName);//name = newName;
		setSize(newSize);//size= newSize;
		setPrice( newPrice);//price= newPrice;
		setCalories(newCAl);//calories= newCAl;

		
		
		
	}
}
