package day32_methods4;

public class Cooking {

	public static void add(String ingredient) {
		System.out.println("Add " + ingredient);
	}
	public static void mix(int time) {
		System.out.println("Mix " + time +" seconds");
	}
	public static void fry(int time) {
		System.out.println("Fry " + time +" minutes");
	}
	public static void boil(int time) {
		System.out.println("Boil " + time+ " minutes");
	}
	
	public static void makePanCakes() {
		System.out.println("~~PANCAKE RECIPE~~");
		add("Milk, Egs, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
	}

}
