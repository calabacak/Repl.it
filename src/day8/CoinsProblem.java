package day8;

import java.util.Scanner;

public class CoinsProblem {
	
	public static void main(String[] args) {
		
		int amount, originalAmount,
	      quarters, dimes, nickels, pennies;
	   System.out.println("Enter a whole number from 1 to 99.");
	   System.out.println("I will find a combination of coins");
	   System.out.println("that equals that amount of change.");
	   Scanner keyboard = new Scanner(System.in);
	   amount = keyboard.nextInt();
	   originalAmount = amount;
	   
	   quarters = amount / 25;
	   amount = amount % 25;
	   dimes = amount / 10;
	   amount = amount % 10;
	   nickels = amount / 5;
	   amount = amount % 5;
	   pennies = amount;
	   
	   System.out.println(quarters + "  "+ dimes+ "  "+nickels+"  " +pennies);
		
		
		
		
		
		
		
	}

}
