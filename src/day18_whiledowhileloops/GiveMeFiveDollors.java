package day18_whiledowhileloops;

import java.util.Scanner;

public class GiveMeFiveDollors {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dollars = 0;
		
		System.out.println("Give me five dollors");
		
		dollars = scan.nextInt();
		
		while(dollars!=5) {
			
			System.out.println("Give me five dollors");
			dollars = scan.nextInt();
		
		}
		
		
		
		System.out.println("thank you");
			
			
		}
		
		
	}


