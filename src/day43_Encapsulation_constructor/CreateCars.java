package day43_Encapsulation_constructor;

public class CreateCars {
	public static void main(String[] args) {
		
		Car delorean = new Car("GM", "De Lorean", "20000");
		
		System.out.println(delorean.toString());
		
		delorean.setPrice("19000");
		System.out.println(delorean.toString());
		
		
		Car corolla = new Car("Toyota", "Coralla", "1500");
		
		System.out.println(corolla.getMake());
		System.out.println(corolla.getModel());
		System.out.println(corolla.getPrice());
		
		
		System.out.println(corolla.toString());
	}

}
