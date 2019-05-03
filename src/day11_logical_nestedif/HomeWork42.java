package day11_logical_nestedif;

import java.util.Scanner;

public class HomeWork42 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter vehicle's year:");
		
		int vehicleYear;
		
		vehicleYear = scan.nextInt();
		if (	(vehicleYear>=1995 && vehicleYear<=1998) ||		(vehicleYear>=2001 && vehicleYear<=2002)	|| (vehicleYear>=2004 && vehicleYear<=2006)	|| (vehicleYear>=2015 && vehicleYear<=2017)	)	{
		System.out.println("Your vehicle needs to be recalled!");}
		
		else
			System.out.println("Your vehicle is fine, enjoy!");
		
	}
	}


