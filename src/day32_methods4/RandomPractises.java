package day32_methods4;

import java.util.Arrays;

public class RandomPractises {

	public static void main(String[] args) {

		/*
		 * task: write a method named findTheNumberOfDigits, input is an integer number,
		 * and out put is the number of digits
		 */

		//System.out.println(findTheNumberOfDigits(2345));
		//System.out.println(isNumberPalindrome(134431));
		//System.out.println(isStringPalindrome("adanada"));
		//System.out.println(isStringPalindromev2("civic"));
		
		
		//System.out.println(Arrays.toString(converToStringArr("I, am, going, to, school, now")));
		String s= "apple, orange, banana, grapes";
		String [] sarr= s.split(",");
		System.out.println(sarr.length);
		char [] sc = s.toCharArray();
		System.out.println(sc.length);
		


	}

	public static int findTheNumberOfDigits(int num) {

		int numOfDigits = 0;

		while (num > 0) {

			num = num / 10;

			numOfDigits++;
		}

		return numOfDigits;

	}

	public static boolean isNumberPalindrome(int num) {

		int palindrome = num;
		int reversed = 0;

		while (palindrome > 0) {

			int remainder = palindrome % 10;

			reversed = reversed * 10 + remainder;

			palindrome = palindrome / 10;

		}

		if (reversed == num) {
			return true;
		} else
			return false;

	}
	public static boolean isStringPalindrome(String str){

		String reversedstr="";

		for(int i= str.length()-1; i>=0; i--){

			reversedstr+= str.charAt(i);

		}

		if(reversedstr.equals(str)){
		return true;
		}else{
		return false;
		}

	}
	public static boolean isStringPalindromev2(String str){

		char [] strarr= str.toCharArray();
		char [] rstrarr = new char [strarr.length];
		
		for(int i=strarr.length-1; i>=0 ; i--) {
			
			rstrarr[str.length()-1-i]= strarr[i];
		}
		
		if(Arrays.equals(strarr, rstrarr)) {
			return true;
		}else {
			return false;
		}
	}
	public static String [] converToStringArr(String str) {
		
		String [] arr = str.split(",");
		
		return arr;
		
	}
	
	
	

}
