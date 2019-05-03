package day19;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		String word1= scan.next();
		int a = word1.length()-1;
		String reversed = "";
		while(a>=0){
			reversed = reversed + word1.charAt(a);
			a--;
		}
		System.out.println(reversed);
		if(word1.contentEquals(reversed)) {
			System.out.println("palindrome");
		}else {
			System.out.println("no palindrome");
		}


	}

}
