package day35_Review;

import java.util.Arrays;

public class Practise6 {
	public static void main(String[] args) {

		String[] order = { "T Shirt", "veli", "T Shirt", "cengiz", "Cactus", "Ali", "Cactus" };
		String[] SPECIAL_ITEMS = { "Cactus", "Fork", "T Shirt" };
		boolean isMember = true;
		// TODO

		/*
		 * * Calculate discount 2 For members: When purchased 3 special items -> get 2
		 * extra special items for free For non-members: When purchased 3 special items
		 * -> get 1 special extra item for free
		 * 
		 * Special items are listed in a SPECIAL_ITEMS array
		 * 
		 * For example, if order has the following items and member is true: "dog",
		 * "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus",
		 * "coffee mug"} if order has the following items and member is true: "dog",
		 * "cactus", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus",
		 * "cactus", "cactus", "coffee mug", "cactus", "cactus"} if order has the
		 * following items and member is false: "dog", "cactus", "cactus", "cactus",
		 * "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "cactus",
		 * "cactus", "coffee mug", "cactus"}
		 * 
		 * When no special items in the order, then order will be returned without
		 * change "dog", "transmission", "barracuda", "coffee mug", "Star Wars game"
		 * 
		 * @param List of items in the order, member
		 * 
		 * @return new array that will have original items in the order and free items
		 * added at the end of the order
		 */

		// cactus case
		int countCactus = 0;
		int countFork = 0;
		int countTShirt = 0;
		String str = "";

		for (int i = 0; i < order.length; i++) {
			if (order[i].contentEquals("Cactus")) {
				countCactus++;
			} else if (order[i].contentEquals("Fork")) {
				countFork++;
			} else if (order[i].contentEquals("T Shirt")) {
				countTShirt++;
			}
		}

		if (countCactus >= 3 && isMember == true) {
			str = "Cactus Cactus";
		} else if (countCactus >= 3 && isMember == false) {
			str = "Cactus";
		}
		
		else if (countFork >= 3 && isMember == true) {
			str = "Fork Fork";
		} else if (countFork >= 3 && isMember == false) {
			str = "Fork";
		}
		
		else if (countTShirt >= 3 && isMember == true) {
			str = "TShirt TShirt";
		} else if (countTShirt >= 3 && isMember == false) {
			str = "TShirt";
		}
		
		if(countCactus<3 && countFork<3 && countTShirt<3) {
			System.out.println(Arrays.toString(order));
		}
		
		else {

		String[] strarr = str.split(" ");

		String[] result = Arrays.copyOf(order, order.length + strarr.length);

		for (int i = 0; i < strarr.length; i++) {
			if(strarr[i].contentEquals("TShirt")) {
			result[result.length - strarr.length + i] = "T Shirt";
			}else
			result[result.length - strarr.length + i] = strarr[i];
			
		}
		System.out.println(Arrays.toString(result));
		}

	}
}
