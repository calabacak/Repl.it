package OfficeHours;

import java.util.*;

public class MaskArrayList {
	public static void main(String[] args) {
		// java
		// ****
		/// 4

		List<String> inputs = new ArrayList<>();
		List<String> masked = new ArrayList<>();
		List<Integer> lengthList = new ArrayList<>();
		String answer;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scan.next();
		inputs.add(word);
		masked.add(maskWord(word));
		lengthList.add(word.length());
		System.out.println("Do you want to enter a new word");
		answer = scan.next();	
		}while(answer.equalsIgnoreCase("yes"));
		
		System.out.println(inputs);
		System.out.println(masked);
		System.out.println(lengthList);
		
		
		
		
		
		
		
		
	}

	public static String maskWord(String word) {

		String maskedWord = "";
		for (int i = 0; i < word.length(); i++) {
			maskedWord += "*";
		}
		return maskedWord;
	}

}
