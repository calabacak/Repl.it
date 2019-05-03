package day8;

import java.util.Scanner;

public class VotingEligiblility {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int eligableAge = 18;
		int yourAge;
		int y;
	
		System.out.println("how old are you");
		
		yourAge = scan.nextInt();
		
		y = yourAge-eligableAge;
		
		if (yourAge>=eligableAge) {
			
			System.out.println("You are eligable to vote for "+y+ " years. ");
		}
		
		else
			System.out.println("You are not eligable to vote, you have still " +(-y) +" years to vote.");
		
		
	} 

}
