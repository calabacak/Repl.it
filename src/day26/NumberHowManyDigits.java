package day26;

import java.util.Arrays;

public class NumberHowManyDigits {
	public static void main(String[] args) {

		int num = 12321;

		int numberOfDigits = 0;

		for (int i = num; i > 0; i = i / 10) {
			numberOfDigits++;
		}
		System.out.println(numberOfDigits);

		int[] digits = new int[numberOfDigits];

		for (int i = 0; i < digits.length; i++) {

			digits[i] = num % 10;
			num = num / 10;
		}

		System.out.println(Arrays.toString(digits));

		// reverse the array now
		int temp = 0;
		for (int i = 0; i < digits.length / 2; i++) {
			temp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = temp;
		}

		// System.out.println(Arrays.toString(digits));
		
		int count=0;
		for(int i= 0; i<digits.length/2; i++) {
			
			if(digits[i]== digits[digits.length - 1 - i]) {
				count++;
			}
		}System.out.println(count);
		
		
		if (count==digits.length/2) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		
		
		

	}

}
