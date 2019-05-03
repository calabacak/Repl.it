package SpecialTopics;

import java.util.Arrays;

public class ST_14_1_HowManyDigitsAndIsPalindrome2 {
	public static void main(String[] args) {

		//find the number of the digits;
		int num = 123212;

		String str= String.valueOf(num);
		
		System.out.println("the num of digits in num " +num+"  is "+ str.length());
		
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		
		if(reversed.equals(str)) {
			System.out.println(num+" is palindrome");
		}else System.out.println(num+ " is not a palindrome");

	}

}
