package day08;

import java.util.Scanner;

public class AreaCodeAndLocalNumber {
	public static void main(String[] args) {
		int areaCode, localNumber;
		System.out.println("enter your area code and local phone number");
		Scanner scan = new Scanner(System.in);
		areaCode = scan.nextInt();
		localNumber = scan.nextInt();
		String phoneNumber = ("(" + areaCode + ")-" + localNumber);
		System.out.println("Calling Number " + phoneNumber);

	}

}
