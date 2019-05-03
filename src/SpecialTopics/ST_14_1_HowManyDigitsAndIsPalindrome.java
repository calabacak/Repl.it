package SpecialTopics;

import java.util.Arrays;

public class ST_14_1_HowManyDigitsAndIsPalindrome {
	public static void main(String[] args) {

		//find the number of the digits;
		int num = 12321;

		int numberOfDigits = 0;

		for (int i = num; i > 0; i = i / 10) {
			numberOfDigits++;
		}
		System.out.println(numberOfDigits);
		
		
		//create an array and take the digits of the number and put them in the array
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
		
		
		
		
		// and now check whether the number is a palindrome;
		
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
