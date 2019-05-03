package day8;

import java.util.Scanner;

public class SecondConversion {
	public static void main(String[] args) {
		int inputSeconds, hours, minutes, seconds;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		
		inputSeconds = scan.nextInt();
		
		hours = inputSeconds/3600;
		minutes = (inputSeconds%3600)/60;
		seconds = inputSeconds - (hours*3600 + minutes*60);
		
		
		System.out.println(hours + " hours, "+ minutes +" minutes, "+ "and "+seconds + " seconds");
		
	}
	
	

}
