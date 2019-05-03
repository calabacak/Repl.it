package HomeWork;

import java.util.Scanner;

public class HomeWork085_ShoppingList2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String itemList = "";
		String item;
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		int numOfItems=0;
		
		do {numOfItems+=1;
			System.out.println("Enter Item"+ numOfItems+" and its price:");
			item=scan.next();
			price=scan.nextDouble();
			totalPrice+=price;
			itemList+= "Item"+numOfItems+": " +item+ " Price: "+price+ ", "; 
			System.out.println("Add one more item?");
			countinue =  scan.next();
			
			
		}while(numOfItems<=10 && countinue.equals("yes"));
		
		itemList=itemList.substring(0,itemList.length()-2);
		System.out.println(itemList);
		System.out.println("Total price: "+totalPrice);
  }
}