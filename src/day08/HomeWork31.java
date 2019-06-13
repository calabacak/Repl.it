package day08;

import java.util.Scanner;

public class HomeWork31 {
	
	public static void main(String[] args) {
		
		int lethalOverdose, amountDrink, numberOfDrinks;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink:");
		
		amountDrink = scan.nextInt();
		
		lethalOverdose = 1000;
		
		numberOfDrinks = lethalOverdose/amountDrink;
		
		System.out.println("It would take about " +numberOfDrinks+ " drinks for a lethal overdose.");
	}

}
