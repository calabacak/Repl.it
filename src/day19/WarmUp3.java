package day19;

import java.util.Random;
import java.util.Scanner;

public class WarmUp3 {
	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Guess Number");
		
		int number = scan.nextInt();
		
		//int guessNumber = 10;
		Random random = new Random();
		
		int guessNumber= random.nextInt(101);
		
		if(guessNumber==number) {
			System.out.println("bingo");
			
		}
		while(number!=guessNumber) {

			if(guessNumber<number) {
				System.out.println("your number is too great");
			}else if (guessNumber>number){
				System.out.println("your number is too small");
			}
			System.out.println("Guess Number");
			number = scan.nextInt();
			if(guessNumber==number) {
				System.out.println("bingo");
			}
			count = count +1;
			
			if (count==4) {
				System.out.println("you lost");
			return;
			}
		}
		
		
	}

}
