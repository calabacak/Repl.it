package day18_whiledowhileloops;

import java.util.Scanner;

public class DiamondStars {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of stars in the middle of the Diamond: ");
		int count = scan.nextInt();
		if (count%2 == 0) {			
			++count;
			System.out.println("Has to be odd so # of stars in the middle has been changed to: " + count);
		}
		
		count = count/2;
		int numberOfSpaces = count;
		int numberOfStars = 1;
		int y =0;
		int x = 0;
		while (x <= count) {
			
			//System.out.println("number of spaces: " + numberOfSpaces);
			//System.out.println("number of stars: " + numberOfStars);			
			y=0;
			while (y < numberOfSpaces) {
				System.out.print(" ");
				y++;
			}
						
			y= 0;
			while (y < numberOfStars) {
				System.out.print("*");
				y++;
			}			
			
			System.out.println("");
			numberOfSpaces -= 1;
			numberOfStars +=2;
			x++;
		}
		
		numberOfSpaces += 2;
		numberOfStars -=4;
		

		while (x > 0) {
			
			//System.out.println("number of spaces: " + numberOfSpaces);
			//System.out.println("number of stars: " + numberOfStars);	
			
			y=0;
			while (y < numberOfSpaces) {
				System.out.print(" ");
				y++;
			}
						
			y= 0;
			while (y < numberOfStars) {
				System.out.print("*");
				y++;
			}			
			
			System.out.println("");
			numberOfSpaces += 1;
			numberOfStars -=2;
			x--;
		}
				
		
			

	}

}

