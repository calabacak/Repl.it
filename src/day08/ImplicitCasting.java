package day08;

import java.util.Scanner;

public class ImplicitCasting {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a pharase:");
		String x = scan.nextLine();
		if(x.equals("I hate you")) {
			System.out.println("I have rephrased that line to read:\n"
					+ "I love you");	
		}	
		else 
			System.out.println(x);

	}

}
//Enter a line of text.
//I hate you.
//    I have rephrased that line to read:
//    I love you.