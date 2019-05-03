package day30_methods2;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {

		// showMe5Numbers();
		rangePrint();

	}

	public static void showMe5Numbers() {

		Random random = new Random();
		int myNumber = 0;
		for (int i = 0; i < 5; i++) {
			myNumber = random.nextInt(1001);
			if (i == 4) {
				System.out.print(myNumber);
			} else
				System.out.print(myNumber + ", ");
		}
	}

	public static void rangePrint() {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter two numbers");

		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}

		} else if (a > b) {
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		} else
			System.out.println(a);

	}

}
