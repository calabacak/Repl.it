package day37_ArrayList;

import java.util.ArrayList;

public class Practise1ArrayList {

	public static void main(String[] args) {

		ArrayList<String> ShoppingList = new ArrayList<>();

		ShoppingList.add("Eggs");
		ShoppingList.add("Banana");
		ShoppingList.add("Apples");
		ShoppingList.add("Cheese");
		ShoppingList.add("Grapes");
		ShoppingList.add("Olive");

		ShoppingList.remove(5);
		ShoppingList.remove("Banana");
		ShoppingList.add("melon");

		System.out.println("========");
		System.out.println(ShoppingList.get(0));
		System.out.println(ShoppingList.get(ShoppingList.size() - 1));
		System.out.println(ShoppingList.size());

		for (String s : ShoppingList) {
			System.out.println(s);
		}
		ShoppingList.clear();
		System.out.println(ShoppingList);
		
		
		

	}
}
