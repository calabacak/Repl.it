package day28_multid_Arrays;

import java.util.Arrays;

public class Loop2ds {public static void main(String[] args) {
	
	
	String [][] pizzas = {{"pineapple", "pepperoni"}, {"anchovies", "mushroom", "olives"}, {"4 cheese"},{"chicken","tomatoes","japalenios","onions"}};
	
	
	
	//System.out.println(pizzas.length);
	
	
	for(String [] pizza: pizzas) {
		for(String p:pizza) {
			System.out.println(p);
			
		}System.out.println("====================");
		
		//or
		
//		for(String [] pizz: pizzas) {
//		System.out.println(Arrays.toString(pizz));
//			}
		
		
		
	}
	

}

}
