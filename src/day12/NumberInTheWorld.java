package day12;

import java.util.Scanner;

public class NumberInTheWorld {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scan.nextInt();
		printNumberInWord(number);

	}
	
	public static void printNumberInWord(int number){
	switch(number) {
	case 0 :System.out.println("Entered "+ number+  " is ZERO");return;
	case 1 :System.out.println("Entered "+ number+  " is ONE");return;
	case 2 :System.out.println("Entered "+ number+  " is TWO");return;
	case 3 :System.out.println("Entered "+ number+  " is THREE");return;
	case 4 :System.out.println("Entered "+ number+  " is FOUR");return;
	case 5 :System.out.println("Entered "+ number+  " is FIVE");return;
	case 6 :System.out.println("Entered "+ number+  " is SIX");return;
	case 7 :System.out.println("Entered "+ number+  " is SEVEN");return;
	case 8 :System.out.println("Entered "+ number+  " is EIGHT");return;
	case 9 :System.out.println("Entered "+ number+  " is NINE");return;
	default: System.out.println("OTHER");
	
	}
	
	}
}
