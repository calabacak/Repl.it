package HomeWork;

import java.util.Scanner;

public class Method1_SimpleCalculator {
	public static void main(String[] args) {

		plus();

	}

	public static void plus() {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter first number");

		int a = scan.nextInt();
		System.out.println("enter second number");

		int b = scan.nextInt();

		System.out.println("the sum of the numbers are= " + (a + b));

	}

}
