package day21;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price;
		String item;
		int totalPrice=0;
		String itemList="";
		System.out.println("How many items are you buying?");
		int nufOfItems = scan.nextInt();
		if(nufOfItems==0) {
			System.out.println("goodbye");
			System.exit(0);;
		}
		for(int i = 1; i<=nufOfItems; i++) {
			
			System.out.println("What is item " + i);
			item = scan.next();
			itemList+=item+", ";
			
	
			System.out.println("How much is item?" + i);
			price = scan.nextInt();
			totalPrice+=price;
			
		}
//		if(itemList.endsWith(", ")) {
//			itemList.replace(',', ' ');
//	
//		}
//		System.out.println("Items are = "+itemList);
		System.out.println("Items are = "+itemList.substring(0, itemList.length()-2));
		System.out.println("Total Price is = "+totalPrice);
		
		
	}

}
