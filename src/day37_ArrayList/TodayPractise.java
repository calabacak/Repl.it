package day37_ArrayList;

import java.util.Arrays;

public class TodayPractise {
	public static void main(String[] args) {

		System.out.println(isPalindrome(12332));;
		
	}
	
	public static boolean isPalindrome(int number) {
		
		int palindrome=0;
		int num=number;
	
		while(num>0) {
			
			int remainder= num%10;
			
			palindrome= palindrome*10+remainder;
			
			num=num/10;
		}
		if(palindrome==number) {
		return true;	
		}
		return false;
		
	}

}