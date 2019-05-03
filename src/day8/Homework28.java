package day8;

import java.util.Scanner;

public class Homework28 {
public static void main(String[] args) {
	
	String  item1, item2, item3, report;
	double  price1, price2, price3, totalPrice, totalPrice1, totalPrice2, totalPrice3;
	int count1, count2, count3;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Item1, count and its price:");
	item1 = scan.nextLine();
	count1 = scan.nextInt();
	price1 = scan.nextDouble();
	//System.out.println("Item1 is \""+ item1+ "\", count is "+count1+ ", price is "+price1);
	
	
	System.out.println("Enter Item2, count and its price:");
	item2 = scan.next();
	count2 = scan.nextInt();
	price2 = scan.nextDouble();
	//System.out.println("Item1 is \""+ item2+ "\", count is "+count2+ ", price is "+price2);
	
	System.out.println("Enter Item3, count and its price:");
	item3 = scan.next();
	count3 = scan.nextInt();
	price3 = scan.nextDouble();
	//System.out.println("Item3 is \""+ item3+ "\", count is "+count3+ ", price is "+price3);
	
	totalPrice1 = price1*count1;
	totalPrice2 = price1*count2;
	totalPrice3 = price1*count3;
		
		
	if (count1>0) {
		System.out.print("Item1: "+item1+" Price: "+ totalPrice1+", ");
		
	}
	if (count2>0) {
		System.out.print("Item2: "+ item2+" Price: "+totalPrice2);
		
	}
	if (count3>0) {
		System.out.println("Item3: "+ item3+" Price: "+totalPrice3);
		
	}
	totalPrice = totalPrice1 + totalPrice2 + totalPrice3;
	System.out.println();
	System.out.println("Total price: "+totalPrice);
	

	
}
}
