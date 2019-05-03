package day06_operators;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int x = keyboard.nextInt();
		
		if (x%2==0) {
			
			System.out.println("the number is even");
		}
		else 
			
			System.out.println("the number is odd");
		

			
	}
	

}
