package day09;

import java.util.Scanner;

public class Canada {
public static void main(String[] args) {
	
	String Canadacapital = "Ottawa";
	String capital;
	
	Scanner scan = new Scanner (System.in);
	System.out.println("What is the capital of Canada");
	capital=scan.next();
	
	if (capital.equalsIgnoreCase(Canadacapital)) { //capital.equals("Ottawa")
		
		System.out.println("Your answer is correct");
	}
	
	else
		
		System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
	
	
}
}
