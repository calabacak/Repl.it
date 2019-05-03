package day16_string_manipulation;

import java.util.Scanner;

public class whilelooptry {
	public static void main(String[] args) {

		int inPutNum = 1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 0 to exit:");

		while (inPutNum != 0) {

			inPutNum = scan.nextInt();
			if (inPutNum == 0) {
				System.out.println("Bingo You entered " + inPutNum);
				return;
			}

			else if (inPutNum != 0)
				// System.out.println("You entered " + inPutNum);
				System.out.println("You entered " + inPutNum + " Enter 0 to exit:");
			continue;

		}

	}
}
