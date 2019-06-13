package day08;

import java.util.Scanner;

public class HomeWork32 {
	public static void main(String[] args) {
		
		int itemPrice, quarters, dimes, nickels,change;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter price in cents");
		
		itemPrice = scan.nextInt();
		
		if (  (itemPrice < 25) || (itemPrice > 100) || (itemPrice%5!=0)   ){
			System.out.println("Invalid price!");
		}
		
		// if (itemPrice%5!=0)                                           {
		// 	System.out.println("Invalid price!");
		//}
		if ((itemPrice >= 25) && (itemPrice <= 100) && itemPrice%5==0)                          {
			change = 100-itemPrice;
			quarters = change/25;
			change = change%25;
			dimes = change/10;
			change = change%10;
			nickels = change/5;
			
			System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		}
		
		

		
		
		
	}

}
