package day23_Arrays;

import java.util.Scanner;

public class ContinuePractise {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String word= scan.next();
		String sentence="";
		
		for (int i = 1; i <= 6; i++) {
			
			String word= scan.next();
			if(word.contentEquals("java")) {
				i--;continue;
			}
			sentence = sentence+word+", ";
			
		}System.out.println(sentence.substring(0, sentence.length()-2));
	}

}
