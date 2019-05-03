package SpecialTopics;

import day35_Review.Practise4;
import day35_Review.Practise5;

public class ST_25_EncryptionIsFun {

public static void main(String[] args) {
		
		String alphabet =  "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String sentence = "I will go";
		String word = "monday";
		char ch = 'y';
		
		
		//test1//
		
		System.out.println(findUniqueChar(alphabet, encrypted, ch));
		
		//test2//
		
		System.out.println(findUniqueString(alphabet, encrypted, word));
		//test3//
		
		System.out.println(findUniqueSentence(alphabet, encrypted, sentence));
	}
//case 1
	public static char findUniqueChar(String alphabet, String encrypted, char ch) {
	
	return alphabet.charAt(encrypted.indexOf(ch));
	
	
}
	//case 2
	public static String findUniqueString(String alphabet, String encrypted, String word) {

		String str = "";
		for (int i = 0; i < word.length(); i++) {
			str += Practise4.findUniqueChar(alphabet, encrypted, word.charAt(i));
		}
		return str;
	}
	
	//case3
	public static String findUniqueSentence(String alphabet, String encrypted, String sentence) {
		String [] strarr= sentence.toLowerCase().split(" ");
		String str = "";
		
		for(String s: strarr) {
			str+=Practise5.findUniqueString(alphabet, encrypted, s)+" ";
		}
		return str;
	}
	


}

