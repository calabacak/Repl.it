package day11_logical_nestedif;

import java.util.Scanner;

public class Condo {
	
	public static void main(String[] args) {
		
		getPrice("Condo",3,true,true,2,0.5,1.5,9,true);
		//getPrice("Single Family House",10,true,true,11,1,1,1,false);
		
	}
		
	public static int getPrice(String homeType,int numberOfBedrooms, boolean backyard, boolean garage,int garageSpots, 
			double metroAccessibility, double highwayAccessibility, int schoolRating, boolean smoking) {
		
		Scanner scan = new Scanner(System.in);
		
		int propertyPrice = 0;
		
		
		
		
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
		
		
		System.out.println("Enter your property type:");
		homeType = scan.nextLine();
		if (homeType.equals("Condo")) {
			propertyPrice = 50000;
			
			
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		propertyPrice = propertyPrice+numberOfBedrooms*30000;
			
		
		System.out.println("Do you have a backyard??");
		backyard = scan.nextBoolean();
		if(backyard==true ) {//|| backyard==false
				System.out.println("Backyard is not available for condo!");
			}
		
		
		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		if(garage)
		{System.out.println("How many spots?");
		int numOfSpots = scan.nextInt();
		if(numOfSpots>10) {numOfSpots=0;System.out.println("Pardon,  it's not a public parking!");}
		else propertyPrice = propertyPrice + numOfSpots*20000;}	
			 
		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();
		if (metroAccessibility<=1) propertyPrice = propertyPrice + 10000;
		else if (metroAccessibility>1 && metroAccessibility<=3) propertyPrice = propertyPrice + 5000;
				
		System.out.println("How close is highway?");	
		highwayAccessibility = scan.nextFloat();
		if (highwayAccessibility<=1) propertyPrice = propertyPrice + 15000;
		else if (highwayAccessibility>1 && highwayAccessibility<=5) propertyPrice = propertyPrice + 8000;
		else if (highwayAccessibility>5 && highwayAccessibility<20) propertyPrice = propertyPrice + 4000;
		
		System.out.println("What's the rating of nearest school?");	
		schoolRating = scan.nextInt();
		if (schoolRating<=10 && schoolRating>8) propertyPrice = propertyPrice + 45000;
		else if (schoolRating>=4 && schoolRating <8) propertyPrice = propertyPrice + 20000;
		else  propertyPrice = propertyPrice + 20000;
		
		System.out.println("Does any of your family members smoking?");	
		smoking = scan.nextBoolean();
		if (smoking==false) propertyPrice = propertyPrice;
		else  propertyPrice = propertyPrice - 5000;
				
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is:  "+propertyPrice+"$" );	
			}
		return propertyPrice;
	}
}
