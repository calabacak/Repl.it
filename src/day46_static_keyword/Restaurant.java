package day46_static_keyword;

public class Restaurant {
	public static void main(String[] args) {
		
		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		Dad.takeASlice();
		kid.takeASlice(1);
		Mom.takeASlice();
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		System.out.println("Total slices: "+Dad.pizzaSlices);
		
		kid.takeASlice(3);
		
		System.out.println("Total slices: "+Dad.pizzaSlices);
	} 
	
	

}
