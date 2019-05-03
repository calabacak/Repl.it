package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork45 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String menuOrdered;
		
		double priceMenuOrdered= 10.0;
		double priceSoda = 2.0;
		
		menuOrdered = scan.next();
		
		if(menuOrdered.contentEquals("chicken")||menuOrdered.contentEquals("burger")) System.out.println(priceMenuOrdered); 
		else System.out.println(priceSoda);
		
		
		
	}

}
