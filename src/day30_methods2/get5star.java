package day30_methods2;

import java.util.Scanner;

public class get5star {
	public static void main(String[] args) {
		
//		get5star();
//		
//		for(int i=1; i<=100; i++)
//		get5star();
		
		
		introduce();
	}
	

	
	
	public static void get5star() {
		
		System.out.println("*****");
	}
	// this method asks for name
	public static void introduce() {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your name?");
		String name= scan.next();	
		System.out.println("Nice to meet you " +name);
	}

}
