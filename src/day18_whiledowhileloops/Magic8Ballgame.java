package day18_whiledowhileloops;

import java.util.Scanner;

public class Magic8Ballgame {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = (int) (Math.random() * 8) + 1;
		
		System.out.println(num);
		
		System.out.println("Choose a number between 1 and 8 inclusive");
		
		int userInput = scan.nextInt();
		
		if (userInput==num) {
			System.out.println("you win");
		}
		
		while(userInput!=num) {
			System.out.println("would you like to play again? ");
			String answer = scan.next();
			if(answer.equalsIgnoreCase("Yes")) {
				num = (int) (Math.random() * 8) + 1;
				System.out.println(num);
				System.out.println("Choose a number between 1 and 8 inclusive");
				userInput = scan.nextInt();
				if (userInput==num) {
					System.out.println("you win");
				}
			}else return;
			
		}
		
		  
	}

}
