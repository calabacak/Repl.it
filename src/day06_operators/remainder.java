package day06_operators;

import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the minutes");
		int minutes = keyboard.nextInt();
		if (minutes < 60) {
			System.out.println("the value is less than 60 please enter some value bigger than 60");
			return;
		}

		int hour = minutes / 60;
		int rem = minutes % 60;
		System.out.println(minutes + " minutes = " + hour + " hour " + rem + " minutes");

	}

}
