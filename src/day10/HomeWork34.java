package day10;

import java.util.Scanner;

public class HomeWork34 {
	
	public static void main(String[] args) {
		
		int numOfCandy, numOfGumballs, numOfCoupons;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of coupons:");
		
		numOfCoupons = scan.nextInt();
		
		if (numOfCoupons>=3) {
			numOfCandy = numOfCoupons/10;
			numOfGumballs = (numOfCoupons-numOfCandy*10)/3;
			System.out.println("Number of Candies: "+numOfCandy);
			System.out.println("Number of Gumballs: "+numOfGumballs);
			}		
		else {
			System.out.println("Not enough coupons");
	
			}
		
		
		
	}

}
