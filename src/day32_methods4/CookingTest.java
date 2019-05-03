package day32_methods4;

public class CookingTest {
	public static void main(String[] args) {
		
		Cooking recipe1 = new Cooking();
		recipe1.add("oil");
		
		Cooking.add("onion");
		Cooking.mix(20);
		Cooking.fry(30);
		Cooking.boil(45);
		Cooking.makePanCakes();
		
	}

}
