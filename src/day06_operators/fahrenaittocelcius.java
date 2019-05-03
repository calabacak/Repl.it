package day06_operators;

import java.util.Scanner;

public class fahrenaittocelcius {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int F = keyboard.nextInt();
		
		float C = (F-32)/1.8f;
		
		System.out.println("the result is = "+ C);
		
		
		
		
		
		
	}

}
