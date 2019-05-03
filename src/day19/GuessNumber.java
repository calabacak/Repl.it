package day19;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		int guessNumber=0;
		int count =0;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int secretNumber= random.nextInt(101);
		System.out.println(secretNumber);
		do {
			System.out.println("enter your guess");
			guessNumber = scan.nextInt();
			count = count+1;
			if(guessNumber==secretNumber) {
				System.out.println("bingo");
				return;
				}
			
			System.out.println("You have 4 chances you tried "+count+" times");
			if(guessNumber>secretNumber) {
				System.out.println("your guess is too large");
				}else if(guessNumber<secretNumber) {
					System.out.println("your guess too small");
				}
			
		}
		while(guessNumber!=secretNumber);
		
	}

}
