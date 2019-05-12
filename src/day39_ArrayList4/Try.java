package day39_ArrayList4;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");

		try {

			int nums = scan.nextInt();
			System.out.println("this is your number: " + nums);
		} catch (Exception e) {
			System.out.println("i said number you dunmb ass");
		}
	}

}
