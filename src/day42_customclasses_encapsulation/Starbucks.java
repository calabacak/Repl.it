package day42_customclasses_encapsulation;

public class Starbucks {
	public static void main(String[] args) {
		
		//declare an array that can store 2 coffee objects
		// String [] nums= new String[];
		
		Coffee [] coffeeArr= new Coffee[2];
		coffeeArr[0]= new Coffee();
		coffeeArr[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		coffeeArr[0].getCoffeeInfo();
		
		Coffee latte= new Coffee();
		latte.setCoffeeInfo("CAFFEE LATTE", "GRANDE", 3.85, 190);
		coffeeArr[1]= latte;
		
	
		
		
		
		
		
	}

}
