package HomeWork;

import java.util.Scanner;

public class Howmanydigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion:");
		
		Long a = scan.nextLong();
		
//		String num = String.valueOf(a);
//		System.out.println("the number of digits in "+num+" is "+ num.length());
//		
		
		int count = 0;
		
		while(a>0) {
			
			if(a/10>0)
				count = count+1;
			a= a/10;
			
			
		}
		int numOfDigits = count+1;
		System.out.println("Number of digits in the number: " + numOfDigits);
		
		
		
	}

}
