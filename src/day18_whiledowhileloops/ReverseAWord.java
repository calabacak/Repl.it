package day18_whiledowhileloops;

import java.util.Scanner;

public class ReverseAWord {
	public static void main(String[] args) {
		
		
		String reversedWord="";
	
		
		Scanner sentence = new Scanner(System.in);
		System.out.println("enter a sentence to be reversed");
		String word = sentence.nextLine();
		int i = word.length()-1;
		
		while(i>=0) {
			
			reversedWord = reversedWord + word.charAt(i);
			i=i-1;
		}
		
		System.out.println(reversedWord);
		
	}

}
