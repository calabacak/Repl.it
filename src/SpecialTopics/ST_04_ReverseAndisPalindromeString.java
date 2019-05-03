package SpecialTopics;

import java.util.Arrays;

public class ST_04_ReverseAndisPalindromeString {
	public static void main(String[] args) {
		//getReversedWord("Cengiz love java");
		
		System.out.println(isStringPalindromev3("civic"));

	}

	public static void getReversedWord(String str) {

		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversedStr = reversedStr + str.charAt(i);//if we did not have reversedStr it would not compile, char isnot string
		}
		System.out.println(reversedStr);
	}
	
	//check if is Palindrome v1
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
	//check if is Palindrome v2
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
	
	//check if is Palindrome v3
		public static boolean isStringPalindromev3(String str){

			String reversed="";
			for(int i=str.length()-1; i>=0; i--) {
				
				reversed+=str.substring(i, i+1);
			}
			if(reversed.equals(str)) {
				return true;
			}else {
				return false;
			}
		}

}
