package day07_Scanner;

import java.util.Scanner;

public class Shopping_List11 {
	public static void main(String[] args) {
		
	
	Scanner keyboard = new Scanner(System.in);
		
	String Item1, Item2, Item3, report;
	double price1, price2, price3, totalPrice;
	
	Scanner keyboard1 = new Scanner(System.in);
	System.out.println("Enter Item1 and its price:");
	Item1 = keyboard1.nextLine();
	price1 = keyboard1.nextDouble();
	//System.out.println(Item1+" "+price1);
	
	Scanner keyboard2 = new Scanner(System.in);
	System.out.println("Enter Item2 and its price:");
	Item2 = keyboard2.nextLine();
	price2 = keyboard2.nextDouble();
	//System.out.println(Item2+" "+price2);
	
	Scanner keyboard3 = new Scanner(System.in);
	System.out.println("Enter Item3 and its price:");
	Item3 = keyboard3.nextLine();
	price3 = keyboard3.nextDouble();
	//System.out.println(Item3+" "+price3);
	
	totalPrice = price1 + price2 +price3;
	//System.out.println(totalPrice);
	
	report = "Item1: " + Item1 +" Price: "+ price1+ " Item2: " + Item2 +" Price: "+ price2 + " Item3: " + Item3 +" Price: "+ price3+
			"\nTotal price: "+ totalPrice;
	System.out.println(report);
			

//	
//	"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
//	"Total price: 15.3"
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

}


