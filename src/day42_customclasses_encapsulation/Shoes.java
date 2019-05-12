package day42_customclasses_encapsulation;

public class Shoes {
	String brand;
	double size;

	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}

	public String getShoesData() {
		return brand + " | " + size;
	}

}
